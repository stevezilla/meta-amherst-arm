# Copyright (C) 2013, 2014 Freescale Semiconductor

DESCRIPTION = "U-Boot provided by Freescale with focus on  i.MX reference boards."
require recipes-bsp/u-boot/u-boot.inc

PROVIDES += "u-boot"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=1707d6db1d42237583f50183a5651ecb"

SRCBRANCH = "master"
SRC_URI = "git://github.com/stevezilla/amherst-uboot-dev.git;protocol=http;branch=${SRCBRANCH}"
SRCREV = "630bd96aae7a86f192c7b88f8fd400a2d120e33f"
#SRC_URI[md5sum] = "1cd90ed8aad407ca8a4cf083fd8142bc" 

S = "${WORKDIR}/git"

inherit fsl-u-boot-localversion

LOCALVERSION ?= "-${SRCBRANCH}"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx6)"
