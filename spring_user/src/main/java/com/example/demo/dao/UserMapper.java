package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.UserEntity;

@Mapper
public interface UserMapper {
	
	/**
	 * ユーザー情報の全検索
	 * 
	 * @return
	 */
	List<UserEntity> findAll();
	
	/**
	 * ユーザー情報 主キー検索
	 * @param id 引数にId
	 * @return
	 */
	 UserEntity getOne (Integer id) ;
	
	/**
	 * ユーザー情報 新規登録 
	 * 
	 * @param user 引数にユーザー情報
	 */
	void save(UserEntity user);
	

}
