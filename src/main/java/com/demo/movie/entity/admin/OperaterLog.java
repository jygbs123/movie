package com.demo.movie.entity.admin;
/**
 * 后台操作日志记录表
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import com.demo.movie.entity.common.BaseEntity;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name="movie_operater_log")
@EntityListeners(AuditingEntityListener.class)
public class OperaterLog extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="operator",nullable=false,length=18)
	private String operator;//操作者
	
	@Column(name="content",nullable=false,length=128)
	private String content;//操作内容
	
	public String getOperator() {
		return operator;
	}

	public void setOperator(String operater) {
		this.operator = operater;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	

	
	
}
