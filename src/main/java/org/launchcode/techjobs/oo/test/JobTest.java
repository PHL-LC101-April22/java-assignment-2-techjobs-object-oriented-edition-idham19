package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
@Test
    public void testSettingJob(){
    Job job1= new Job();
    Job job2= new Job();
    assertNotEquals(job1,job2);
}
@Test
    public void testJobConstructorSetsAllFields(){

    Job job = new Job("Product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality control"),new CoreCompetency("Persistence"));
assertTrue(String.valueOf(job instanceof Job),true);

assertEquals("Product tester",job.getName());
}
@Test
    public void testJobsForEquality(){

    Job job1= new Job("Product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality control"),new CoreCompetency("Persistence"));
    Job job2= new Job("Product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality control"),new CoreCompetency("Persistence"));
    assertEquals(job1.getId(),job1.getEmployer().getId());
    assertEquals(job1.getId(),job1.getLocation().getId());
    assertEquals(job1.getId(),job1.getPositionType().getId());
    assertEquals(job1.getId(),job1.getCoreCompetency().getId());
    assertNotEquals(job1.getId(),job2.getId());
}
}
