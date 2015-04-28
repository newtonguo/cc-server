package at.ebssoftware.ebs.timesheet;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cc.Application;
import com.cc.configuration.TomcatPoolDataSourceProperties;
import com.cc.model.User;
import com.cc.mybatis.mapper.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { Application.class })
public class ConfigurationTest {

	@Autowired
	TomcatPoolDataSourceProperties dataSourceProperties;

	@Autowired
	UserMapper userMapper;
	
	@Test
	public void testMapperScanWithSpringBoot() {

		Assert.assertNotNull(dataSourceProperties);
		Assert.assertEquals("org.hsqldb.jdbcDriver", dataSourceProperties.getDriverClassName());
		
		Assert.assertNotNull(userMapper);
	}

}
