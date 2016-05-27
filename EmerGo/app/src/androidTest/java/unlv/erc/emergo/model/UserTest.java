package unlv.erc.emergo.model;


import junit.framework.TestCase;

public class UserTest extends TestCase {

    // tests for user

    public void testGetName(){
        User user = new User();
        String name = "Peter";
        user.setName("Peter");
        assertEquals(name,user.getName());
    }

    public void testSetName(){
        User user = new User();
        user.setName("Maria Joaquina");
        assertEquals("Maria Joaquina", user.getName());
    }

    public void testSetNameEmpty(){
        User user = new User();
        user.setName("");
        assertEquals("", user.getName());
    }

    // tests for typeBlood

    public void testSetTypeBloodBiggerThree(){
        User user = new User();
        user.setTypeBlood("AB-");
        final int MAXIMUM = 3;
        boolean result = true;
        if(user.getTypeBlood().length()>MAXIMUM){
            assertFalse(result);
        }else{
            assertTrue(result);
        }
    }


}
