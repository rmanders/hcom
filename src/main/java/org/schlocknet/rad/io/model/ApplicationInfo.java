package org.schlocknet.rad.io.model;

import lombok.Value;

@Value
public class ApplicationInfo
{
  String applicationName;

  String applicationVersion;

  String fleet;

  String buildDate;
}
