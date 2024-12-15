package top.nguyennd.ddd.domain.service.impl;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import top.nguyennd.ddd.domain.repository.HiDomainRepository;
import top.nguyennd.ddd.domain.service.HiDomainService;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class HiDomainServiceImpl implements HiDomainService {

  HiDomainRepository hiDomainRepository;

  @Override
  public String sayHi(String name) {
    return hiDomainRepository.sayHi(name);
  }
}
