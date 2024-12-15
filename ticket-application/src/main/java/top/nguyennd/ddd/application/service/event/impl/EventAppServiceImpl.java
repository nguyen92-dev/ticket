package top.nguyennd.ddd.application.service.event.impl;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import top.nguyennd.ddd.application.service.event.EventAppService;
import top.nguyennd.ddd.domain.service.HiDomainService;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class EventAppServiceImpl implements EventAppService {

  HiDomainService hiDomainService;

  @Override
  public String sayHi(String name) {
    return hiDomainService.sayHi(name);
  }
}