package com.xworkz.septhierteentask;


import com.xworkz.septhierteen.MobileDTO;
import com.xworkz.septhierteen.MobileRepoImp;

public class MobileRunner {
	
	


		public static void main(String[] args) {
			MobileRepositoryImp ref1=new MobileRepositoryImp();
			MobileServiceImp ref2=new MobileServiceImp(ref1);
			MobileDTO ref3=new MobileDTO(57,46,98,"iphone","18ip","usa","apple","led","doulby","krish","20mp","dj","20megabyte","4g cum 5g","dualsim","moreThan u think","lighting cable","smooth","ios-13","limitless","BassLikefeel","smoothy","not mentioned","clear");
			ref2.validateAndsave(ref3);
			

		}

	}


