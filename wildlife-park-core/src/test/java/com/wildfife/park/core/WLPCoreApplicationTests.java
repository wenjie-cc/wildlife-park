package com.wildfife.park.core;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WLPCoreApplicationTests {

	@Test
	void contextLoads() {
	}
	
	
	 @Test
    public void test01(){

        List<Integer> userBzlineIds = Arrays.asList(1,2,15);

       List<UserEntity> users =  getUserEntities(10);

        Map<String, List<UserEntity>> pageKeyUserMap = new HashMap<>();

        Map<String, List<UserEntity>> isAppPageKeyUserMap = new HashMap<>();
        users.stream()
                .filter(p -> p.getIsAppMultibzlines() == 1)
                .forEach(p->{
                     List<UserEntity> userList = isAppPageKeyUserMap.get(p.getPageKey());
                    if(userList==null) userList = new ArrayList<>();
                    userList.add(p);
                    isAppPageKeyUserMap.put(p.getPageKey(), userList);
                });

        isAppPageKeyUserMap.entrySet().forEach(isAppEntry->{
            final String pagekey = isAppEntry.getKey();
            final List<UserEntity> isAppUsers = isAppEntry.getValue();
            //compare login user: userBzlineIds  with template
            
        });
        //todo:  admin , *   4
        //
    }

    private List<UserEntity> getUserEntities(final int num) {

        List<UserEntity> users = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            UserEntity userEntity=new UserEntity();
            userEntity.setId(Long.valueOf(i+""));
            userEntity.setPageKey("pagekey");
            userEntity.setRole("*");
            userEntity.setActionJson("json"+i);
            if(i==8){
                userEntity.setIsAppMultibzlines(1);
                userEntity.setBzlineGroupIds("1;2;3");
                userEntity.setOrderLevel(1);
            }else if(i==9){
                userEntity.setIsAppMultibzlines(1);
                userEntity.setBzlineGroupIds("1;2;3");
                userEntity.setBzlineGroupCodes("3");
                userEntity.setOrderLevel(2);
            }else if(i==10){
                userEntity.setIsAppMultibzlines(1);
                userEntity.setBzlineGroupCodes("1;3");
                userEntity.setOrderLevel(3);
            }
            users.add(userEntity);
        }
        return users;
    }

}
