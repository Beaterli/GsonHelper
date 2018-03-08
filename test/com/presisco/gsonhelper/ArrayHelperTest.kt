package com.presisco.gsonhelper

import org.junit.Test

class ArrayHelperTest {
    private val data = "[{\"sid\":\"CXA01626MNA2M5C\",\"cas\":0.0,\"ccs\":0.0,\"aload\":0.0,\"aspd1\":0.0,\"aspd2\":0.0,\"aspd3\":0.0,\"aspd4\":0.0,\"aspd5\":0.0,\"apst1\":0.0,\"apst2\":0.0,\"apst3\":0.0,\"apst4\":0.0,\"apst5\":0.0,\"cpst1\":0.0,\"cpst2\":0.0,\"cpst3\":0.0,\"cpst4\":0.0,\"cpst5\":0.0,\"load1\":0.0,\"load2\":0.0,\"load3\":0.0,\"load4\":0.0,\"load5\":0.0,\"pd\":0,\"pn\":null,\"ps\":null,\"pl\":0,\"pm\":0,\"recordtime\":\"2018-03-05 16:37:20.0212\"},{\"sid\":\"CXA01673MNA2MAC\",\"cas\":0.0,\"ccs\":0.0,\"aload\":0.0,\"aspd1\":0.0,\"aspd2\":0.0,\"aspd3\":0.0,\"aspd4\":0.0,\"aspd5\":0.0,\"apst1\":0.0,\"apst2\":0.0,\"apst3\":0.0,\"apst4\":0.0,\"apst5\":0.0,\"cpst1\":0.0,\"cpst2\":0.0,\"cpst3\":0.0,\"cpst4\":0.0,\"cpst5\":0.0,\"load1\":0.0,\"load2\":0.0,\"load3\":0.0,\"load4\":0.0,\"load5\":0.0,\"pd\":0,\"pn\":null,\"ps\":null,\"pl\":0,\"pm\":0,\"recordtime\":\"2018-03-05 16:37:20.0525\"},{\"sid\":\"G168.188.130\",\"cas\":0.0,\"ccs\":0.0,\"aload\":0.0,\"aspd1\":0.0,\"aspd2\":0.0,\"aspd3\":0.0,\"aspd4\":0.0,\"aspd5\":0.0,\"apst1\":0.0,\"apst2\":0.0,\"apst3\":0.0,\"apst4\":0.0,\"apst5\":0.0,\"cpst1\":0.0,\"cpst2\":0.0,\"cpst3\":0.0,\"cpst4\":0.0,\"cpst5\":0.0,\"load1\":0.0,\"load2\":0.0,\"load3\":0.0,\"load4\":0.0,\"load5\":0.0,\"pd\":0,\"pn\":null,\"ps\":null,\"pl\":0,\"pm\":0,\"recordtime\":\"2018-03-05 16:37:20.0993\"},{\"sid\":\"G168.188.130\",\"cas\":0.0,\"ccs\":0.0,\"aload\":0.0,\"aspd1\":0.0,\"aspd2\":0.0,\"aspd3\":0.0,\"aspd4\":0.0,\"aspd5\":0.0,\"apst1\":0.0,\"apst2\":0.0,\"apst3\":0.0,\"apst4\":0.0,\"apst5\":0.0,\"cpst1\":0.0,\"cpst2\":0.0,\"cpst3\":0.0,\"cpst4\":0.0,\"cpst5\":0.0,\"load1\":0.0,\"load2\":0.0,\"load3\":0.0,\"load4\":0.0,\"load5\":0.0,\"pd\":0,\"pn\":null,\"ps\":null,\"pl\":0,\"pm\":0,\"recordtime\":\"2018-03-05 16:37:20.1306\"},{\"sid\":\"G168.188.131\",\"cas\":0.0,\"ccs\":0.0,\"aload\":0.0,\"aspd1\":0.0,\"aspd2\":0.0,\"aspd3\":0.0,\"aspd4\":0.0,\"aspd5\":0.0,\"apst1\":0.0,\"apst2\":0.0,\"apst3\":0.0,\"apst4\":0.0,\"apst5\":0.0,\"cpst1\":0.0,\"cpst2\":0.0,\"cpst3\":0.0,\"cpst4\":0.0,\"cpst5\":0.0,\"load1\":0.0,\"load2\":0.0,\"load3\":0.0,\"load4\":0.0,\"load5\":0.0,\"pd\":0,\"pn\":null,\"ps\":null,\"pl\":0,\"pm\":0,\"recordtime\":\"2018-03-05 16:37:20.1462\"},{\"sid\":\"G168.188.132\",\"cas\":0.0,\"ccs\":0.0,\"aload\":0.0,\"aspd1\":0.0,\"aspd2\":0.0,\"aspd3\":0.0,\"aspd4\":0.0,\"aspd5\":0.0,\"apst1\":0.0,\"apst2\":0.0,\"apst3\":0.0,\"apst4\":0.0,\"apst5\":0.0,\"cpst1\":0.0,\"cpst2\":0.0,\"cpst3\":0.0,\"cpst4\":0.0,\"cpst5\":0.0,\"load1\":0.0,\"load2\":0.0,\"load3\":0.0,\"load4\":0.0,\"load5\":0.0,\"pd\":0,\"pn\":null,\"ps\":null,\"pl\":0,\"pm\":0,\"recordtime\":\"2018-03-05 16:37:20.1618\"},{\"sid\":\"G168.188.133\",\"cas\":0.0,\"ccs\":0.0,\"aload\":0.0,\"aspd1\":0.0,\"aspd2\":0.0,\"aspd3\":0.0,\"aspd4\":0.0,\"aspd5\":0.0,\"apst1\":0.0,\"apst2\":0.0,\"apst3\":0.0,\"apst4\":0.0,\"apst5\":0.0,\"cpst1\":0.0,\"cpst2\":0.0,\"cpst3\":0.0,\"cpst4\":0.0,\"cpst5\":0.0,\"load1\":0.0,\"load2\":0.0,\"load3\":0.0,\"load4\":0.0,\"load5\":0.0,\"pd\":0,\"pn\":null,\"ps\":null,\"pl\":0,\"pm\":0,\"recordtime\":\"2018-03-05 16:37:20.1775\"},{\"sid\":\"G168.188.134\",\"cas\":0.0,\"ccs\":0.0,\"aload\":0.0,\"aspd1\":0.0,\"aspd2\":0.0,\"aspd3\":0.0,\"aspd4\":0.0,\"aspd5\":0.0,\"apst1\":0.0,\"apst2\":0.0,\"apst3\":0.0,\"apst4\":0.0,\"apst5\":0.0,\"cpst1\":0.0,\"cpst2\":0.0,\"cpst3\":0.0,\"cpst4\":0.0,\"cpst5\":0.0,\"load1\":0.0,\"load2\":0.0,\"load3\":0.0,\"load4\":0.0,\"load5\":0.0,\"pd\":0,\"pn\":null,\"ps\":null,\"pl\":0,\"pm\":0,\"recordtime\":\"2018-03-05 16:37:20.1931\"},{\"sid\":\"CXA01667MNA2MAC\",\"cas\":1500.0,\"ccs\":1500.0,\"aload\":2.0,\"aspd1\":0.0,\"aspd2\":0.0,\"aspd3\":0.0,\"aspd4\":0.0,\"aspd5\":0.0,\"apst1\":50.0,\"apst2\":100.0,\"apst3\":100.0,\"apst4\":0.0,\"apst5\":0.0,\"cpst1\":50.0,\"cpst2\":100.0,\"cpst3\":100.0,\"cpst4\":0.0,\"cpst5\":0.0,\"load1\":0.14,\"load2\":0.224,\"load3\":0.07,\"load4\":0.0,\"load5\":0.0,\"pd\":6666,\"pn\":\"O6666.NC\",\"ps\":\"运行中\",\"pl\":6,\"pm\":0,\"recordtime\":\"2018-03-05 16:37:21.3650\"},{\"sid\":\"CXA01666MNA2MAC\",\"cas\":1500.0,\"ccs\":1500.0,\"aload\":2.0,\"aspd1\":0.0,\"aspd2\":0.0,\"aspd3\":0.0,\"aspd4\":0.0,\"aspd5\":0.0,\"apst1\":50.0,\"apst2\":100.0,\"apst3\":100.0,\"apst4\":0.0,\"apst5\":0.0,\"cpst1\":50.0,\"cpst2\":100.0,\"cpst3\":100.0,\"cpst4\":0.0,\"cpst5\":0.0,\"load1\":0.112,\"load2\":0.0419,\"load3\":0.2379,\"load4\":0.0,\"load5\":0.0,\"pd\":6666,\"pn\":\"O6666.NC\",\"ps\":\"运行中\",\"pl\":6,\"pm\":0,\"recordtime\":\"2018-03-05 16:37:21.3962\"},{\"sid\":\"CXA01672MNA2MAC\",\"cas\":1500.0,\"ccs\":1500.0,\"aload\":2.0,\"aspd1\":0.0,\"aspd2\":0.0,\"aspd3\":0.0,\"aspd4\":0.0,\"aspd5\":0.0,\"apst1\":50.0,\"apst2\":100.0,\"apst3\":100.0,\"apst4\":0.0,\"apst5\":0.0,\"cpst1\":50.0,\"cpst2\":100.0,\"cpst3\":100.0,\"cpst4\":0.0,\"cpst5\":0.0,\"load1\":0.112,\"load2\":0.196,\"load3\":0.1539,\"load4\":0.0,\"load5\":0.0,\"pd\":6666,\"pn\":\"O6666.NC\",\"ps\":\"运行中\",\"pl\":6,\"pm\":0,\"recordtime\":\"2018-03-05 16:37:21.4118\"},{\"sid\":\"CXA01626MNA2M5C\",\"cas\":1500.0,\"ccs\":1500.0,\"aload\":2.0,\"aspd1\":0.0,\"aspd2\":0.0,\"aspd3\":0.0,\"aspd4\":0.0,\"aspd5\":0.0,\"apst1\":50.0,\"apst2\":100.0,\"apst3\":100.0,\"apst4\":0.0,\"apst5\":0.0,\"cpst1\":50.0,\"cpst2\":100.0,\"cpst3\":100.0,\"cpst4\":0.0,\"cpst5\":0.0,\"load1\":0.1539,\"load2\":0.1259,\"load3\":0.056,\"load4\":0.0,\"load5\":0.0,\"pd\":6666,\"pn\":\"O6666.NC\",\"ps\":\"运行中\",\"pl\":6,\"pm\":0,\"recordtime\":\"2018-03-05 16:37:21.4431\"},{\"sid\":\"CXA01673MNA2MAC\",\"cas\":1500.0,\"ccs\":1500.0,\"aload\":2.0,\"aspd1\":0.0,\"aspd2\":0.0,\"aspd3\":0.0,\"aspd4\":0.0,\"aspd5\":0.0,\"apst1\":50.0,\"apst2\":100.0,\"apst3\":100.0,\"apst4\":0.0,\"apst5\":0.0,\"cpst1\":50.0,\"cpst2\":100.0,\"cpst3\":100.0,\"cpst4\":0.0,\"cpst5\":0.0,\"load1\":0.028,\"load2\":0.1259,\"load3\":0.014,\"load4\":0.0,\"load5\":0.0,\"pd\":6666,\"pn\":\"O6666.NC\",\"ps\":\"运行中\",\"pl\":6,\"pm\":0,\"recordtime\":\"2018-03-05 16:37:21.4587\"},{\"sid\":\"G168.188.130\",\"cas\":1500.0,\"ccs\":1500.0,\"aload\":0.0,\"aspd1\":0.0,\"aspd2\":0.0,\"aspd3\":0.0,\"aspd4\":0.0,\"aspd5\":0.0,\"apst1\":50.0,\"apst2\":100.0,\"apst3\":100.0,\"apst4\":0.0,\"apst5\":0.0,\"cpst1\":50.0,\"cpst2\":100.0,\"cpst3\":100.0,\"cpst4\":0.0,\"cpst5\":0.0,\"load1\":0.0,\"load2\":0.0,\"load3\":0.0,\"load4\":0.0,\"load5\":0.0,\"pd\":0,\"pn\":\"o6666.prg\",\"ps\":\"运行\",\"pl\":2,\"pm\":0,\"recordtime\":\"2018-03-05 16:37:21.4743\"},{\"sid\":\"G168.188.131\",\"cas\":1500.18311,\"ccs\":1500.0,\"aload\":0.0,\"aspd1\":0.0,\"aspd2\":0.0,\"aspd3\":0.0,\"aspd4\":0.0,\"aspd5\":0.0,\"apst1\":49.9999924,\"apst2\":100.0,\"apst3\":100.0,\"apst4\":0.0,\"apst5\":0.0,\"cpst1\":50.0,\"cpst2\":100.0,\"cpst3\":100.0,\"cpst4\":0.0,\"cpst5\":0.0,\"load1\":0.0,\"load2\":0.0,\"load3\":0.0,\"load4\":0.0,\"load5\":0.0,\"pd\":0,\"pn\":\"o6666.prg\",\"ps\":\"运行\",\"pl\":2,\"pm\":0,\"recordtime\":\"2018-03-05 16:37:21.4900\"},{\"sid\":\"G168.188.132\",\"cas\":1500.18311,\"ccs\":1500.0,\"aload\":0.0,\"aspd1\":0.0,\"aspd2\":0.0,\"aspd3\":0.0,\"aspd4\":0.0,\"aspd5\":0.0,\"apst1\":50.0,\"apst2\":100.0,\"apst3\":100.000153,\"apst4\":0.0,\"apst5\":0.0,\"cpst1\":50.0,\"cpst2\":100.0,\"cpst3\":100.0,\"cpst4\":0.0,\"cpst5\":0.0,\"load1\":0.0,\"load2\":0.0,\"load3\":0.0,\"load4\":0.0,\"load5\":0.0,\"pd\":0,\"pn\":\"o6666.prg\",\"ps\":\"运行\",\"pl\":2,\"pm\":0,\"recordtime\":\"2018-03-05 16:37:21.5212\"},{\"sid\":\"G168.188.133\",\"cas\":1500.0,\"ccs\":1500.0,\"aload\":0.0,\"aspd1\":0.0,\"aspd2\":0.0,\"aspd3\":0.0,\"aspd4\":0.0,\"aspd5\":0.0,\"apst1\":50.0,\"apst2\":100.0,\"apst3\":100.0,\"apst4\":0.0,\"apst5\":0.0,\"cpst1\":50.0,\"cpst2\":100.0,\"cpst3\":100.0,\"cpst4\":0.0,\"cpst5\":0.0,\"load1\":0.0,\"load2\":0.0,\"load3\":0.0,\"load4\":0.0,\"load5\":0.0,\"pd\":0,\"pn\":\"o6666.prg\",\"ps\":\"运行\",\"pl\":2,\"pm\":0,\"recordtime\":\"2018-03-05 16:37:21.5368\"},{\"sid\":\"G168.188.134\",\"cas\":1500.18311,\"ccs\":1500.0,\"aload\":0.0,\"aspd1\":0.0,\"aspd2\":0.0,\"aspd3\":0.0,\"aspd4\":0.0,\"aspd5\":0.0,\"apst1\":50.0,\"apst2\":100.0,\"apst3\":100.000008,\"apst4\":0.0,\"apst5\":0.0,\"cpst1\":50.0,\"cpst2\":100.0,\"cpst3\":100.0,\"cpst4\":0.0,\"cpst5\":0.0,\"load1\":0.0,\"load2\":0.0,\"load3\":0.0,\"load4\":0.0,\"load5\":0.0,\"pd\":0,\"pn\":\"o6666.prg\",\"ps\":\"运行\",\"pl\":2,\"pm\":0,\"recordtime\":\"2018-03-05 16:37:21.5525\"},{\"sid\":\"CXA01667MNA2MAC\",\"cas\":1500.0,\"ccs\":1500.0,\"aload\":2.0,\"aspd1\":0.0,\"aspd2\":0.0,\"aspd3\":0.0,\"aspd4\":0.0,\"aspd5\":0.0,\"apst1\":50.0,\"apst2\":100.0,\"apst3\":100.0,\"apst4\":0.0,\"apst5\":0.0,\"cpst1\":50.0,\"cpst2\":100.0,\"cpst3\":100.0,\"cpst4\":0.0,\"cpst5\":0.0,\"load1\":0.14,\"load2\":0.224,\"load3\":0.07,\"load4\":0.0,\"load5\":0.0,\"pd\":6666,\"pn\":\"O6666.NC\",\"ps\":\"运行中\",\"pl\":6,\"pm\":0,\"recordtime\":\"2018-03-05 16:37:21.7712\"},{\"sid\":\"CXA01666MNA2MAC\",\"cas\":1500.0,\"ccs\":1500.0,\"aload\":2.0,\"aspd1\":0.0,\"aspd2\":0.0,\"aspd3\":0.0,\"aspd4\":0.0,\"aspd5\":0.0,\"apst1\":50.0,\"apst2\":100.0,\"apst3\":100.0,\"apst4\":0.0,\"apst5\":0.0,\"cpst1\":50.0,\"cpst2\":100.0,\"cpst3\":100.0,\"cpst4\":0.0,\"cpst5\":0.0,\"load1\":0.112,\"load2\":0.028,\"load3\":0.2379,\"load4\":0.0,\"load5\":0.0,\"pd\":6666,\"pn\":\"O6666.NC\",\"ps\":\"运行中\",\"pl\":6,\"pm\":0,\"recordtime\":\"2018-03-05 16:37:21.7868\"}]\n"

    @Test
    fun validate() {

    }
}