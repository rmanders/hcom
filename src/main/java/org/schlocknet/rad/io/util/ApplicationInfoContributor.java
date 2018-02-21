package org.schlocknet.rad.io.util;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

import org.schlocknet.rad.io.model.ApplicationInfo;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;

public class ApplicationInfoContributor implements InfoContributor
{

  @Getter
  private final ApplicationInfo applicationInfo;

  public ApplicationInfoContributor(ApplicationInfo applicationInfo) {
    if (applicationInfo == null) {
      throw new IllegalStateException("ApplicationInfo parameter cannot be null");
    }
    this.applicationInfo = applicationInfo;
  }

  @Override
  public void contribute(final Info.Builder builder) {
      final Map<String, Object> appInfo = new HashMap<>();
  }
}
