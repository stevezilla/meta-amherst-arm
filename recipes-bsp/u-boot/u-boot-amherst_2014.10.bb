# Copyright (C) 2013, 2014 Freescale Semiconductor

DESCRIPTION = "U-Boot provided by Freescale with focus on  i.MX reference boards."
require recipes-bsp/u-boot/u-boot.inc

PROVIDES += "u-boot"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=1707d6db1d42237583f50183a5651ecb"

SRCBRANCH = "master"
SRC_URI = "git://github.com/stevezilla/amherst-uboot-2014.10.git;protocol=http;branch=${SRCBRANCH}"
SRCREV = "9cd404a948ca117d477c72437fc1e58f11c064dd"
#SRC_URI[md5sum] = "1cd90ed8aad407ca8a4cf083fd8142bc" 

S = "${WORKDIR}/git"

inherit fsl-u-boot-localversion

LOCALVERSION ?= "-${SRCBRANCH}"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx6)"



