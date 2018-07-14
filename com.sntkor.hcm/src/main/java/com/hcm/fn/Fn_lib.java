package com.hcm.fn;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.hcm.domain.DateVO;

public class Fn_lib {
	
	
	
	//D_day 구하는 함수
	public Object d_day(int year, int month, int day) throws Exception{
		try {
			
			Calendar cal = Calendar.getInstance(); //현재 오늘 날짜
			Calendar dday = Calendar.getInstance();
			
			dday.set(year, month-1, day);
			long d_day = dday.getTimeInMillis()/86400000; 
			// 각각 날의 시간 값을 얻어온 다음 
			//( 1일의 값(86400000 = 24시간 * 60분 * 60초 * 1000(1초값) ) )
			long t_day = cal.getTimeInMillis()/86400000;
			long count = d_day - t_day;
			
			if(count<0) {
				String text = "대기중";
				return (String)text;
			}
			return (int)count;
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	Date today = new Date();
	SimpleDateFormat f_date = new SimpleDateFormat("yyyyMMdd");
	
	// 참여중 인원 구하는 함수
	public Object project_status_on(List<DateVO> date) throws Exception{
		int count=0;
		try {
			for(int i=0; i<date.size(); i++) {
				int compare= f_date.format(today).compareTo(f_date.format(f_date.parse(date.get(i).getDate())));
				if(compare <= 0 ) {
					count+=1;
				}
			}
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	// 휴식중 인원 구하는 함수
	public Object project_status_off(List<DateVO> date) throws Exception{
		int count = 0;
		try {
			for(int i=0; i<date.size(); i++) {
				int compare= f_date.format(today).compareTo(f_date.format(f_date.parse(date.get(i).getDate())));
				if(compare > 0 ) {
					count+=1;
				}
			}
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		
	}
	
	
}
