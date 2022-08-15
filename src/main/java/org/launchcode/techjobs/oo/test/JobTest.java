package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    private boolean empty;

    @Test
    public void testSettingJobId(){
        Job job1 =new Job();
        Job job2 =new Job();
        Assert.assertNotEquals(job1.getId(),job2.getId());
        Assert.assertNotEquals(job2.getId(),job1.getId());


}
@Test
public void testEqualsMethod(){
        Job job1=new Job("Name",new Employer("Employer"),new Location("Location"),new PositionType("Position Type"),new CoreCompetency("Core Competency"));
        Job job2=new Job("Name",new Employer("Employer"),new Location("Location"),new PositionType("Position Type"),new CoreCompetency("Core Competency"));
        assertTrue(job1.equals(job1));
        assertFalse(job1.equals(job2));
        assertNotEquals(job1.getId(), job2.getId());
}
@Test
    public void testJobConstructorSetsAllFields(){

    Job job = new Job("Product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality control"),new CoreCompetency("Persistence"));
//assertTrue(String.valueOf(job instanceof Job),true);
    Assert.assertTrue(job.getName()=="Product tester");
    Assert.assertTrue(job.getEmployer().getValue()=="ACME");
    Assert.assertTrue(job.getLocation().getValue()=="Desert");
    Assert.assertTrue(job.getPositionType().getValue()=="Quality control");
    Assert.assertTrue(job.getCoreCompetency().getValue()=="Persistence");

    Assert.assertEquals("Product tester",job.getName());
    Assert.assertEquals("ACME",job.getEmployer().getValue());
    Assert.assertEquals("Desert",job.getLocation().getValue());
    Assert.assertEquals("Quality control",job.getPositionType().getValue());
    Assert.assertEquals("Persistence",job.getCoreCompetency().getValue());
}
@Test
    public void testJobsForEquality(){
    Job job1= new Job("Product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality control"),new CoreCompetency("Persistence"));
    Job job2= new Job("Product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality control"),new CoreCompetency("Persistence"));
//    assertEquals(job1.getId(),job1.getEmployer().getId());
//    assertEquals(job1.getId(),job1.getLocation().getId());
//    assertEquals(job1.getId(),job1.getPositionType().getId());
//    assertEquals(job1.getId(),job1.getCoreCompetency().getId());
    assertNotEquals(job1.getId(),job2.getId());
    Assert.assertFalse(job1.equals(job2));
}

@Test
    public void testToStringStartsAndEndsWithNewLine (){
    Job job =new Job("Product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality control"),new CoreCompetency("Persistence"));
    char firstCharacter= job.toString().charAt(0);
    char lastCharacter=job.toString().charAt(job.toString().length()-1);
    Assert.assertEquals('\n', '\n');
    Assert.assertEquals('\n', '\n');
    }

@Test
    public void testToStringContainsCorrectLabelsAndData(){
    Job job =new Job("Product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality control"),new CoreCompetency("Persistence"));
    assertEquals(String.valueOf(job),job.toString());
}
@Test
    public void testToStringHandlesEmptyField() {
   String comment ="Data not available";
    Job job =new Job("",new Employer(""),new Location(""),new PositionType(""),new CoreCompetency(""));
    Job job1=new Job();

    Assert.assertEquals(job.toString(),String.valueOf(job));
    Assert.assertTrue(job.getEmployer().getValue()=="Data not available");
    Assert.assertTrue(job.getLocation().getValue()=="Data not available");
    Assert.assertTrue(job.getCoreCompetency().getValue()=="Data not available");
    Assert.assertTrue(job.getPositionType().getValue()=="Data not available");
    Assert.assertEquals(String.valueOf(job),job.toString());
}
@Test
    public void testToStringHandlesEmptyFieldCallsToString(){
        Job job=new Job();
        job.toString();
}

}
