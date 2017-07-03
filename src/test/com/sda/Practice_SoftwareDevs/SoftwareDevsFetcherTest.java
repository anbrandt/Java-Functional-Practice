package com.sda.Practice_SoftwareDevs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrzej on 03.07.17.
 */
public class SoftwareDevsFetcherTest {

	private SoftwareDevsFetcher softwareDevsFetcher = new SoftwareDevsFetcher();


	@Before
	public void setUp() {

	}

	@Test
	public void shouldStart() {

		Assert.assertNotNull(softwareDevsFetcher);
	}



}