# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Navigation Layer for Range sensors like sonar and IR"
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
ROS_AUTHOR = "David!!"
HOMEPAGE = "http://wiki.ros.org/range_sensor_layer"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "navigation_layers"
ROS_BPN = "range_sensor_layer"

ROS_BUILD_DEPENDS = " \
    angles \
    costmap-2d \
    dynamic-reconfigure \
    geometry-msgs \
    pluginlib \
    roscpp \
    rospy \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    angles \
    costmap-2d \
    dynamic-reconfigure \
    geometry-msgs \
    pluginlib \
    roscpp \
    rospy \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    angles \
    costmap-2d \
    dynamic-reconfigure \
    geometry-msgs \
    pluginlib \
    roscpp \
    rospy \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslint \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/wu-robotics/navigation_layers_release/archive/release/melodic/range_sensor_layer/0.5.0-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/range_sensor_layer"
SRC_URI = "git://github.com/wu-robotics/navigation_layers_release;${ROS_BRANCH};protocol=https"
SRCREV = "3a6b486539ffc6094f0b915e8125ceadd7d1f3a8"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('navigation-layers', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
