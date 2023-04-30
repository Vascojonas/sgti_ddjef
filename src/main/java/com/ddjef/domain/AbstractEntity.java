package com.ddjef.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;

@MappedSuperclass
@SuppressWarnings("serial")


public abstract class AbstractEntity<ID extends Serializable> implements Serializable {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private ID id;

	@Column(name = "created_at", nullable = false, columnDefinition = "timestamp")
	@CreationTimestamp
	private LocalDateTime createdAt;

	@Column(name = "updated_at", columnDefinition = "timestamp")
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	
	public AbstractEntity() {
		  super();
	}
	
	

	  
	public AbstractEntity(ID id) {
		super();
		this.id = id;
	}




	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}
	
	public LocalDateTime getCreatedAt() {
	  return createdAt;
	}

    public LocalDateTime getUpdatedAt() {
	    return updatedAt;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractEntity<?> other = (AbstractEntity<?>) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "id = " + id;
	}
	
	
	
	
	
}
