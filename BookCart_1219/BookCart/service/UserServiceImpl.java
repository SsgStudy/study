package BookCart.service;

import BookCart.vo.Person;

public class UserServiceImpl implements PersonService{
    @Override
    public void checkPersonInfo(Person person) {
        // 사용자 정보 유효한지 구현하기
    }

    @Override
    public void menuGuestInfo(Person person) {
        System.out.println("현재 고객 정보 : ");
        System.out.println("이름 " + person.getName() + "연락처 " + person.getPhoneNumber());
    }


}
