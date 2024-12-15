package top.nguyennd.ddd.infrastructure.persistence.repository;

import org.springframework.stereotype.Repository;
import top.nguyennd.ddd.domain.repository.HiDomainRepository;

@Repository
public class HiInsfraRepositoryImpl implements HiDomainRepository {
  @Override
  public String sayHi(String name) {
    return String.format("Hi %s from Infrastructure", name);
  }
}
