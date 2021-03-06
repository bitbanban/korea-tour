package com.bitcamp.korea_tour.model.service.homestay;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bitcamp.korea_tour.model.homestay.HomeStayReviewDto;
import com.bitcamp.korea_tour.model.homestay.HomeStayReviewPhotoDto;
import com.bitcamp.korea_tour.model.homestay.JoinHomeStayReviewDto;
import com.bitcamp.korea_tour.model.mapper.HomeStayReviewMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HomeStayReviewServiceImpl implements HomeStayReviewService{
	private final HomeStayReviewMapper m;

	@Override
	public List<HomeStayReviewDto> getAllReview(int homeStayNum) {
		// TODO Auto-generated method stub
		return m.getAllReview(homeStayNum);
	}

	@Override
	public List<HomeStayReviewPhotoDto> getAllReviewPhoto(int homeStayReviewNum) {
		// TODO Auto-generated method stub
		return m.getAllReviewPhoto(homeStayReviewNum);
	}

	@Override
	public int maxOfRegroup() {
		// TODO Auto-generated method stub
		return m.maxOfRegroup();
	}

	@Override
	public void insertReview(HomeStayReviewDto dto) {
		// TODO Auto-generated method stub
		m.insertReview(dto);
	}

	@Override
	public void insertAnswerReview(HomeStayReviewDto dto) {
		// TODO Auto-generated method stub
		m.insertAnswerReview(dto);
	}

	@Override
	public int getReviewNum(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return m.getReviewNum(map);
	}

	@Override
	   public int ifReply(int homeStayNum, int regroup) {
	      Map<String, Integer> map=new HashMap<String, Integer>();
	      map.put("homeStayNum", homeStayNum);
	      map.put("regroup", regroup);
	      return m.ifReply(map);
	   }

	
	@Override
	public int checkReviewWritten(int homeStayReservationNum) {
		// TODO Auto-generated method stub
		return m.checkReviewWritten(homeStayReservationNum);
	}

	@Override
	public List<HomeStayReviewDto> getReviewByloginNum(int loginNum) {
		// TODO Auto-generated method stub
		return m.getReviewByloginNum(loginNum);
	}

	@Override
	public int getTotalCountOfReviewsByLoginNum(int loginNum) {
		// TODO Auto-generated method stub
		return m.getTotalCountOfReviewsByLoginNum(loginNum);
	}

	@Override
	public HomeStayReviewDto getReviewByHomeStayReviewNum(int homeStayReviewNum) {
		// TODO Auto-generated method stub
		return m.getReviewByHomeStayReviewNum(homeStayReviewNum);
	}

	@Override
	public int checkFirstData() {
		// TODO Auto-generated method stub
		return m.checkFirstData();
	}

}