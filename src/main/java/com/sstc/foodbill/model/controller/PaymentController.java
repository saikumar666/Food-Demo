package com.sstc.foodbill.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sstc.foodbill.base.BaseResponse;
import com.sstc.foodbill.model.Payment;
import com.sstc.foodbill.model.serviceimpl.PaymentServiceImpl;
import com.sstc.foodbill.util.AppConstant;

@RestController
@RequestMapping(value = "/paymentapi")
public class PaymentController {

	@Autowired
	PaymentServiceImpl paymentServiceImpl;

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public ResponseEntity<BaseResponse> deleteRecord(@RequestParam("id") Long id) {

		if (paymentServiceImpl.isExist(id)) {
			paymentServiceImpl.deletebyId(id);
			return new ResponseEntity<BaseResponse>(
					new BaseResponse(HttpStatus.OK.value(), AppConstant.STATUS_DELETE_SUCCESS, null), HttpStatus.OK);
		} else {
			return new ResponseEntity<BaseResponse>(
					new BaseResponse(HttpStatus.OK.value(), AppConstant.STATUS_RECORD_NOTFOUND, null), HttpStatus.OK);
		}

	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ResponseEntity<BaseResponse> detailRecord(@RequestParam("id") Long id) {

		if (paymentServiceImpl.isExist(id)) {
			Payment payment = paymentServiceImpl.findById(id);
			if (payment != null)
				return new ResponseEntity<BaseResponse>(
						new BaseResponse(HttpStatus.OK.value(), AppConstant.STATUS_RECORD_FOUND, payment),
						HttpStatus.OK);

			return new ResponseEntity<BaseResponse>(
					new BaseResponse(HttpStatus.OK.value(), AppConstant.STATUS_RECORD_NOTFOUND, null), HttpStatus.OK);
		} else {
			return new ResponseEntity<BaseResponse>(
					new BaseResponse(HttpStatus.OK.value(), AppConstant.STATUS_RECORD_NOTFOUND, null), HttpStatus.OK);
		}

	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResponseEntity<BaseResponse> listAll() {

		return new ResponseEntity<BaseResponse>(
				new BaseResponse(HttpStatus.OK.value(), AppConstant.STATUS_LIST_SUCCESS, paymentServiceImpl.findAll()),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<BaseResponse> createRecord(@RequestBody Payment record) {

		record = paymentServiceImpl.saveOrUpdate(record);

		return new ResponseEntity<BaseResponse>(
				new BaseResponse(HttpStatus.OK.value(), AppConstant.STATUS_SAVE_SUCCESS, record), HttpStatus.CREATED);

	}

}
