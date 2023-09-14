package com.xworkz.septhierteentask;

public class MobileRepoImpl implements MobileRepo{
	
	
		MobileDTO[] m=new MobileDTO[10];
		int pos;
		
		public void save(MobileDTO dto) {
			this.m[pos]=dto;
			System.out.println(dto+ " " +pos);
			pos++;
			
		}
		public boolean isExist(MobileDTO dto) {
			for(int i=0;i<=this.pos;i++) {
				MobileDTO ref=m[i];
				if(ref!=null && ref.equals(dto)) {
					System.out.print("sorry it cant store");
					return true;
					
				}
				else {
					System.out.println("it is present in the database");
				}
			}
			return false;
		}
		public MobileDTO findByname(String name) {
			for(int i=0;i<=this.pos;i++) {
				MobileDTO p=m[i];
				if(p.getName().equals(name)) {
					System.out.println("it is been found" +p);
					return p;
					
				}
			}
			return null;
		}
		public MobileDTO findBynameAndlocation(String name, String location) {
			for(int i=0;i<=this.pos;i++) {
			MobileDTO	k=m[i];
			if(k!=null && k.getName().equals(name) && k.getLocation().equals(location)) {
				System.out.println(k);
				return k;
			}
			}
			return null;
		}
		public MobileDTO findAll() {
			for(int i=0;i<=this.pos;i++) {
				MobileDTO o=m[i];
				System.out.println(o);
				return o;
			}
			return null;
		}
		

	}



