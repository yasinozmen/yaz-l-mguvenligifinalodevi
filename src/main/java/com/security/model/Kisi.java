package com.security.model;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="kisiler")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Kisi {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	@Column(name = "ad")
	private String ad;
	@Column(name = "soyad")
	private String soyad;
	@Column(name = "yas")
	private int yas;
}
//yasinözmen





