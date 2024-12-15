package top.nguyennd.ddd.controller.resource;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.nguyennd.ddd.application.service.event.EventAppService;

@RestController
@RequestMapping("/hi")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class HiController {

  EventAppService eventAppService;

  @GetMapping
  public String hi() {
    return eventAppService.sayHi("Nguyen");
  }
}
