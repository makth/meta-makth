require ../../../openembedded-core/meta/recipes-core/images/core-image-minimal.bb

#DESCRIPTION = "A small image just capable of allowing a device to boot for Spitz(SL-C3000).

MACHINE_FEATURES_append = " alsa pcmcia keyboard"
MACHINE_FEATURES_remove = " bluetooth"
DISTRO_FEATURES_append = " alsa pcmcia keyboard"
DISTRO_FEATURES_remove = " x11"
DISTRO_FEATURES_remove = " opengl"
DISTRO_FEATURES_remove = " bluetooth bluez5 wifi"
IMAGE_FEATURES ?= "debug-tweaks"
IMAGE_FEATURES += "splash dev-pkgs tools-sdk staticdev-pkgs"

IMAGE_INSTALL_append = " packagegroup-core-buildessential kernel-modules"
IMAGE_INSTALL_append = " kernel-dev git subversion"
IMAGE_INSTALL_append = " sudo psmisc gnutls ncurses pcmciautils"
IMAGE_INSTALL_append = " libsdl"
IMAGE_INSTALL_append = " formfactor kbd keymaps alsa-utils zaurusd"
IMAGE_INSTALL_append = " fuse-exfat exfat-utils"
IMAGE_INSTALL_append = " cc65"
IMAGE_INSTALL_append = " python3-pip python3-scons python3-six"
IMAGE_INSTALL_append = " tiff jpeg giflib libpng"
IMAGE_INSTALL_append = " tzdata"
IMAGE_INSTALL_append = " directfb"

# PACKAGE_INSTALL_append = " packagegroup-core-buildessential kernel-modules"
# PACKAGE_INSTALL_append = " kernel-dev git subversion"
# PACKAGE_INSTALL_append = " sudo psmisc gnutls ncurses pcmciautils"
# PACKAGE_INSTALL_append = " libsdl"
# PACKAGE_INSTALL_append = " formfactor kbd keymaps alsa-utils zaurusd"
# PACKAGE_INSTALL_append = " fuse-exfat exfat-utils"
# PACKAGE_INSTALL_append = " cc65"
# PACKAGE_INSTALL_append = " python3-pip python3-scons python3-six"
# PACKAGE_INSTALL_append = " tiff jpeg giflib libpng"
# PACKAGE_INSTALL_append = " tzdata"
# PACKAGE_INSTALL_append = " directfb"

# PACKAGE_INSTALL_append = " packagegroup-core-x11-base"

# IMAGE_LINGUAS = "ja-jp en-us"

