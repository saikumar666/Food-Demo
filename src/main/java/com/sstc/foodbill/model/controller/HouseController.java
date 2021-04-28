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
import com.sstc.foodbill.model.House;
import com.sstc.foodbill.model.serviceimpl.HouseServiceImpl;
import com.sstc.foodbill.util.AppConstant;

@RestController
@RequestMapping(value = "/houseapi")
public class HouseController {
	@Autowired
	HouseServiceImpl houseServiceImpl;

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public ResponseEntity<BaseResponse> deleteRecord(@RequestParam("id") Long id) {

		if (houseServiceImpl.isExist(id)) {
			houseServiceImpl.deletebyId(id);
			return new ResponseEntity<BaseResponse>(
					new BaseResponse(HttpStatus.OK.value(), AppConstant.STATUS_DELETE_SUCCESS, null), HttpStatus.OK);
		} else {
			return new ResponseEntity<BaseResponse>(
					new BaseResponse(HttpStatus.OK.value(), AppConstant.STATUS_RECORD_NOTFOUND, null), HttpStatus.OK);
		}

	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ResponseEntity<BaseResponse> detailRecord(@RequestParam("id") Long id) {

		if (houseServiceImpl.isExist(id)) {
			House house = houseServiceImpl.findById(id);
			if (house != null)
				return new ResponseEntity<BaseResponse>(
						new BaseResponse(HttpStatus.OK.value(), AppConstant.STATUS_RECORD_FOUND, house), HttpStatus.OK);

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
				new BaseResponse(HttpStatus.OK.value(), AppConstant.STATUS_LIST_SUCCESS, houseServiceImpl.findAll()),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<BaseResponse> createRecord(@RequestBody House record) {

		record = houseServiceImpl.saveOrUpdate(record);

		return new ResponseEntity<BaseResponse>(
				new BaseResponse(HttpStatus.OK.value(), AppConstant.STATUS_SAVE_SUCCESS, record), HttpStatus.CREATED);

	}

}
