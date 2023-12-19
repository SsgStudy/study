package BookCart.service;

import BookCart.vo.Person;

public interface PersonService {
    //사용자, 관리자 관련된 기능
    public void checkPersonInfo(Person person);
    public void menuGuestInfo(Person person);
}
