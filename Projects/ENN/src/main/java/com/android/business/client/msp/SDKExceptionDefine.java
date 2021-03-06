package com.android.business.client.msp;
public enum SDKExceptionDefine {
	UnknownErrorLibrary(0, "未知错误"),
	FaildLoadLibrary(-1, "加载SDK库失败"),
	NotFoundLibrary(-2, "SDK文件不存在"),
	UnsupportedEncodingForUTF8(-100, "不支持UTF-8编码格式"),
	FaildExecuteMsgCallback(-101, "处理CMU消息失败"),
	FirstLogin(-300, "第一次登陆系统"),
	CmuSettingNotFound(-301, "未找到cmu.xml配置文件"),
	CheckUserPwdSuccess(-1001, "用户名密码校验成功"),
	CheckUserPwdFaild(-1002, "用户名密码校验失败"),
	NoFunctionUser(-2000, "用户无操作权限"),
	NoSysFunctionUser(-2001, "用户无后台管理权限"),
	NoBusinessFunctionUser(-2002, "用户无前端业务权限"),
	Success(200, "操作成功"),
	Common_Begin(300, "通用错误码开始"),
	Common_XmlNull(301, "xml为空"),
	Common_XmlError(302, "xml异常"),
	Common_NoBuffers(303, "缓存不够"),
	Common_SendMsgFailed(304, "发送消息失败"),
	Common_ParamError(305, "参数错误"),
	Common_DeviceOffline(306, "设备掉线"),
	Common_DvrIpPortDup(307, "dvr设备ip, port重复"),
	Common_NetSDKError(308, "Net SDK错误"),
	Common_NoRight(309, "没有操作权限"),
	Common_CannotFindDevice(310, "没有找到请求的设备"),
	Common_CannotFindUser(311, "用户id不存在"),
	Common_IbpProtocolNull(312, "Ibp Protocal Null"),
	Common_SocketError(313, "socket建立异常"),
	Common_SerialPort_InUse(314, "串行口正在被使用"),
	Common_SerialPort_OpenFailded(315, "串口打开失败"),
	DB_ConnectFailed(400, "数据库连接失败"),
	DB_OperateFailed(401, "数据库操作失败"),
	DB_QueryFaild(402, "数据库查询失败"),
	DBOperate_Fail_RecordNotExists(403, "数据库操作的记录不存在"),
	DB_End(499, "数据库错误码结束"),
	OutProcess_NoSession(900, "outprocess找不到句柄"),
	OutProcess_Unservice(901, "outprocess服务不可用"),
	OutProcess_NotFoundBYSEQ(902, "没有找到peer"),
	OutProcess_ProtocolNull(903, "协议为空"),
	LoadBalance_CMUAleadyLogin(910, "负载均衡CMU已经登录"),
	LoadBalance_NoMaster(911, "负载均衡无Master"),
	CMU_NotindFound(1001, "未找到CMU"),
	CMU_KeyConflict(1002, "CMU关键字冲突"),
	CMU_LoginNameConflict(1003, "用户名重复"),
	CMU_UserNotLogin(1004, "用户未登录"),
	CMU_LoginNameNotExist(1005, "用户名不存在"),
	CMU_ErrorPassword(1006, "密码错误"),
	CMU_UserLocked(1007, "用户被冻结"),
	CMU_UserOutOfDate(1008, "用户名过期"),
	CMU_UserNotInDate(1009, "用户不在使用期限内"),
	CMU_UserHasLogin(1010, "用户已经登录，不允许重复登录"),
	CMU_AdminOnlineOver(1011, "admin在线超过限制"),
	CMU_UserOnlineOver(1012, "用户在线超过限制"),
	CMU_UserMax(1013, "用户达到最大值"),
	CMU_ExtPasswordError(1014, "话机密码不能为空"),
	CMU_ExtNumberDuplicate(1015, "话机号码与备号重复"),
	CMU_ExtAttendantDuplicate(1016, "话机号码与总机号码重复"),
	CMU_ExtEmptyError(1017, "分机号码为空"),
	CMU_OrgDeleteHavesubOrg(1018, "挂有组织，不能删除该组织"),
	CMU_OrgDeleteHavesubDEV(1019, "挂有设备，不能删除该组织"),
	CMU_OrgDeleteHaveUser(1020, "挂有用户，不能删除该组织"),
	CMU_OrgDeleteHaveDomain(1021, "挂有域，不能删除该组织"),
	CMU_Domain_Id_Err(1022, "DomainId 错误"),
	CMU_ORG_NOT_EXIST(1023, "<组织不存在"),
	CMU_SAME_CODE_DEV_NOT_EXIST(1024, "不存在相同编码设备"),
	CMU_SAME_CODE_DEV_EXIST(1025, "已存在相同编码设备"),
	CMU_OLD_DEV_NOT_EXIST(1026, "原设备不存在"),
	CMU_PARENT_DEV_NOT_EXIST(1027, "父设备不存在"),
	CMU_IMEI_ERROR(1030, "该账号已绑定其他设备"),
	VTDU_StartUnfinished(1101, "VTDU启动未完成"),
	VTDU_NotFindVRU(1102, "未找到VRU"),
	VTDU_NoEnoughCapability(1103, "VTDU没有足够的能力"),
	VTDU_DeviceUnsupport(1104, "设备不支持"),
	VTDU_CannotFindDevice(1105, "VTDU找不到设备"),
	VTDU_CannotFindSlave(1106, "找不到Slave"),
	VTDU_SendMsgMasterToSlave(1107, "Master向Slave发送消息失败"),
	VTDU_SendMsgMasterToDomaind(1108, "Master向其它域发送消息失败"),
	VTDU_DeviceOffline(1109, "设备掉线"),
	VTDU_DllnameEmpty(1110, "VTDU Dll名称为空"),
	VTDU_RecordSeekFormat(1111, "录像拖动格式错误"),
	VTDU_CascadeServerOffline(1112, "级连服务RTSP掉线"),
	VTDU_Channel_Used_In_Talking(1113, "语音对讲-通道处于使用状态，用于语音限制"),
	VTDU_Channel_Used_In_Playing(1114, "录像回放-通道处于使用状态，用于录像回放限制"),
	VTDU_RTSPTokenInvalid(1115, "RTSP令牌无效"),
	VTDU_ChannelClosed(1116, "通道已关闭"),
	VTDU_NotFindChannel(1117, "找不到通道"),
	VTDU_RTSPDisconnected(1118, "RTSP连接断开"),
	VTDU_CascadeConnectFailed(1119, "级连服务连接失败"),
	VTDU_NoPortForUse(1120, "没有可用端口"),
	VTDU_PlayNoSetup(1121, "发送Play消息前未发送Setup消息"),
	VTDU_RTPBuildFaild(1122, "码流传输网络建立失败"),
	VTDU_AddNodeIntoSendList(1123, "加入发送列表失败"),
	VTDU_DelNodeFormSendList(1124, "删除发送列表失败"),
	VTDU_RecordDownloadFinished(1125, "录像已经下载完成"),
	VTDU_NoRecordFiles(1126, "没有录像文件"),
	VTDU_ReceiverNetBuildFailed(1127, "码流接收网络建立失败"),
	VTDU_SSOpenFileFailed(1128, "SS打开文件失败"),
	VTDU_MsgSaveTimeout(1129, "消息保存超时"),
	VTDU_NotFindPlayInfo(1130, "找不到播放信息错误"),
	VTDU_Red5ConnectFailed(1131, "连接Red5失败"),
	VTDU_QueryUseridFailed(1132, "查询用户ID失败"),
	VTDU_GetChannelIndexFailed(1133, "获取通道索引失败"),
	VTDU_NotFindUSBProxy(1134, "获取USB代理服务失败"),
	VTDU_Red5ConnechAlready(1135, "和Red5的连接已存在"),
	VTDU_NotFoundStartVideoRequest(1136, "没有找到播放请求消息"),
	VTDU_Notfound_Active_Url(1137, "没有找到有效的URL"),
	DMU_DeviceOffline(1201, "设备离线"),
	DMU_PTZControlBysenior(1202, "高级用户正在控制云台"),
	DMU_PTZControlAssenior(1203, "抢占低级用户的云台控制权"),
	DMU_PTZControlLockByOther(1204, "云台被其他用户锁定"),
	DMU_PTZControlNotLock(1205, "云台没有锁定"),
	DMU_ServerUnavailable(1206, "DMU服务不可用"),
	DMU_MasterSendToSlave(1207, "Master向Slave发送消息失败"),
	DMU_UpmasterSendToLowMaster(1208, "UpMaster向LowMaster发送消息失败"),
	DMU_UnknownModel(1209, "未知DMU模块"),
	DMU_LoginSameIpPort(1210, "重复登录设备"),
	DMU_LoginDeviceFailed(1211, "登录设备失败"),
	DMU_SCSOptFailure(1212, "动环操作失败"),
	DMU_NotFindDevByDomidCode(1213, "根据DomCode，没有找到DevId"),
	DMU_CanNotModifyPrepoint(1214, "修改失败,当前预置位已关联一次设备"),
	DMU_FetchGraphyBusy(1215, "正在抓图"),
	DMU_FetchGraphyUnknownError(1216, "抓图未知错误"),
	DMU_FetchGraphyDeviceOff(1217, "抓图过程中设备断线"),
	DMU_PTZControlLockBySelf(1218, "云台已经被自己锁定"),
	DMU_OTHERQUERYING(1219, "其他用户正查询"),
	VRU_NoSlaveAvaliable(1301, "没有Slave可用"),
	VRU_NotSupported(1302, "功能不支持"),
	VRU_DatabaseFailed(1303, "数据库操作失败"),
	VRU_PlanDataEmpty(1304, "计划配置为空"),
	VRU_StartUnfinished(1305, "VRU启动未完成"),
	VRU_NotFoundVTDU(1306, "未找到VTDU"),
	VRU_RtspConnectFailed(1307, "RTSP连接失败"),
	VRU_CreateChannelFailed(1308, "创建通道失败"),
	VRU_RTPBuildFailed(1309, "RTP创建失败"),
	VRU_NoRtpPortForUse(1310, "无可用RTP端口"),
	VRU_ChannelUsedInStoring(1311, "通道处于使用状态，用于存储"),
	VRU_AddStreamIdFailed(1312, "存储时添加流id失败"),
	VRU_ReceiveDataTimeout(1313, "接受码流超时"),
	VRU_ServerDisconnect(1314, "和服务的连接断开"),
	VRU_DeviceDisconnect(1315, "设备连接断开"),
	VRU_AddCqfsSessionFailed(1316, "添加cqfssession失败"),
	VRU_ReceiveStreamTimeout(1317, "接受码流超时"),
	VRU_RightAlter(1318, "权限改变"),
	VRU_DeviceAlter(1319, "设备信息改变"),
	UAS_Cmu(1601, "UAS中CMU模块错误"),
	UAS_DmuMaster(1602, "UAS中Dmu Master模块错误"),
	UAS_DmuSlave(1603, "UAS中Dmu Slave模块错误"),
	UAS_Vtdu(1604, "UAS中Vtdu模块错误"),
	UAS_Logic(1605, "UAS中逻辑模块错误"),
	UAS_Sip(1606, "UAS中Sip错误"),
	UAS_Rtsp(1607, "UAS中Rtsp错误"),
	UAS_Pg(1608, "UAS中Pg错误"),
	UAS_Res(1609, "UAS中应答协议错误"),
	Adapter_CannotFindDevice(1801, "Adapter找不到设备"),
	Adapter_DynamicCastError(1802, "数据类型转化错误"),
	Adapter_DvrIpPortDup(1803, "Adapter dvr设备ip, port重复"),
	Adapter_DllLoadFailed(1804, "Adapter Dll加载失败"),
	Adapter_ParamterError(1805, "Adapter 参数错误"),
	Adapter_DeviceOffline(1806, "Adapter 设备掉线"),
	Adapter_Sdk_UserPassworkError(1851, "用户名密码错误"),
	Adapter_Sdk_LogTimeout(1852, "登陆超时错误"),
	Adapter_Sdk_UserLocked(1853, "用户锁定错误"),
	Adapter_Sdk_IllegalUser(1854, "非法用户"),
	Adapter_Sdk_ResourceError(1855, "资源错误"),
	Adapter_Sdk_LognetError(1856, "网络错误"),
	Adapter_Sdk_PingError(1857, "设备离线"),
	Adapter_Sdk_MaxUserNumber(1858, "超过最大用户数量错误"),
	Adapter_Sdk_RealPaly(1859, "实时视频播放错误"),
	Adapter_Sdk_VideoStop(1860, "视频停止错误"),
	Adapter_Sdk_RealTask(1861, "语音对讲错误"),
	Adapter_Sdk_TaskStop(1862, "对讲停止错误"),
	Adapter_Sdk_ChannelUsedInPlaying(1863, "该通道用户正在使用"),
	Adapter_Sdk_RecordDownloadFinished(1864, "录像下载完成错误"),
	Adapter_Sdk_LoginDeviceFailed(1865, "登陆设备失败错误"),
	Adapter_Sdk_Api(1866, "API错误"),
	Adapter_Sdk_LicenceDevAddDeny(1867, "拒绝添加设备"),
	Adapter_Sdk_LicenceDevTypeDeny(1868, "拒绝添加设备类型"),
	Adapter_Sdk_LicenceAcceptOver(1869, "Licence接收能力超出"),
	MCU_UnknowModel(1901, "服务模式为Unknown"),
	MCU_NotMaster(1902, "不是master"),
	MCU_InvalidConnection(1903, "MCU无效连接"),
	MCU_InvalidParam(1904, "MCU无效参数"),
	MCU_NoUserId(1905, "用户ID不存在"),
	MCU_NoImdsInfo(1906, "用户关联的IMDS信息找不到"),
	MCU_KeyConflict(1907, "关键字冲突"),
	MCU_PasswordInvalid(1908, "登录会议密码错误"),
	MCU_LoginAlready(1909, "用户已经在会议状态"),
	MCU_MeetingIdInvalid(1910, "会议无效或不存在"),
	MCU_NotLogin(1911, "未登录会议"),
	MCU_MeetingLocked(1912, "会议被锁定"),
	MCU_NoSIPServer(1913, "没有sip服务器"),
	MCU_SIPInitFaild(1914, "sip初始化失败"),
	MCU_SIPRegisterFaild(1915, "sip 注册失败"),
	MCU_NotMainSpeaker(1916, "不是主讲人"),
	MCU_UserOffline(1917, "用户不在线"),
	MCU_SessionInvalid(1918, "无效session"),
	MCU_NoCallerNumber(1919, "无虚拟主叫号码可用"),
	MCU_HookError(1920, "摘机错误"),
	MCU_MaxUserLimit(1921, "达到参会用户最大数上限"),
	MCU_ImdsOffline(1922, "IMDS服务离线"),
	MCU_MeetNotModify(1923, "会议进行中，不允许操作"),
	MCU_EmergencyMeetingExist(1924, "已经存在应急会议"),
	MCU_PhoneIsCalling(1925, "电话正在拨打中"),
	MCU_PhoneStateWrong(1926, "电话状态错误"),
	MCU_FEATURE_NOT_SUPPORTED(1927, "不支持该功能"),
	MCU_CollectionIsExisted(1928, "联系人信息已经被收藏"),
	MCU_ROOM_IS_NOT_EXISTED(1929, "会议室不存在"),
	MCU_ADGU_OFFLINE(1930, "ADGU服务离线"),
	MCU_MEMBER_IS_IN_THE_MEETING(1931, "已经在会议室内"),
	MCU_DOMAIN_ERROR(1932, "域错误"),
	MCU_MEMBER_IS_IN_OTHER_MEETING(1933, "用户已经在其他会议室内"),
	MCU_MEETING_IS_NOT_EXISTED(1934, "会议不存在"),
	MCU_MAIN_SPEAKER_IS_NOT_EXISTED(1935, "主讲人不存在"),
	IIS_NotMaster(2001, "不是Master"),
	IIS_PlanNotExist(2002, "巡检未执行"),
	IIS_UnknownOpt(2003, "未知操作"),
	IIS_AddTaskFail(2004, "添加任务失败"),
	IIS_UpdateTaskFail(2005, "任务配置更新失败"),
	IIS_DeleteTaskFail(2006, "任务删除失败"),
	IIS_AddPointFail(2007, "添加巡检点失败"),
	IIS_UpdatePointFail(2008, "更新巡检点失败"),
	IIS_DeletePointFail(2009, "删除巡检点失败"),
	IIS_AddTimeSchduleFail(2010, "添加时间模板失败"),
	IIS_UpdateTimeSchduleFail(2011, "更新时间模板失败"),
	IIS_DeleteTimeSchduleFail(2012, "删除时间模板失败"),
	IIS_QueryTaskFail(2013, "查询任务失败"),
	IIS_QueryPointFail(2014, "查询巡检点失败"),
	IIS_QueryTimeTemplateFail(2015, "查询时间模板失败"),
	IIS_CreatePlayFailed(2016, "创建播放Instance失败"),
	IIS_SnapshotFailed(2017, "抓图失败"),
	IIS_ExcutePlanFailed(2018, "计划执行失败"),
	IIS_PlanStarted(2019, "计划已经开始"),
	IIS_PlanStopped(2020, "计划已经结束"),
	IIS_CalIrIndexError(2021, "红外指标计算失败"),
	IIS_CalIrTempDiffError(2022, "红外温差计算失败"),
	IIS_PlanSubscribeFailed(2023, "计划订阅失败"),
	IIS_ServerUnavailable(2024, "IIS服务不可用"),
	FS_NotMaster(2101, "不是Master"),
	ADGU_UnkownModel(2201, "服务模式为Unknown"),
	ADGU_NotMaster(2202, "不是master"),
	ADGU_InvalidConnection(2203, "无效连接"),
	ADGU_InvalidParam(2204, "无效参数"),
	ADGU_NoUserId(2205, "用户id不存在"),
	ADGU_KeyConflict(2206, "关键字冲突"),
	ADGU_RTSP(2207, "ADGU中Rtsp错误"),
	ADGU_IpPort(2208, "ADGU地址错误"),
	ADGU_IdMapping(2209, "ADGU设备id映射错误"),
	ADGU_VideoIsOpen(2210, "ADGU中视频已打开"),
	ADGU_INVITE_FAILED(2211, "ADGU INVITE请求失败"),
	ADGU_VIDEO_HAS_BEEN_CLOSED(2212, "ADGU视频已经被关闭"),
	ADGU_BYE_FAILED(2213, "ADGU BYE请求失败"),
	ADGU_CAN_NOT_GET_RTP_INFO(2214, "ADGU获取RTP信息失败"),
	ADGU_MEDIA_SESSION_IS_NULL(2215, "ADGU媒体信息为空"),
	VMS_UnkownModel(2301, "服务模式为Unknown"),
	VMS_NotMaster(2302, "不是master"),
	VMS_InvalidConnection(2303, "无效连接"),
	VMS_InvalidParam(2304, "无效参数"),
	VMS_NoUserId(2305, "用户id不存在"),
	VMS_KeyConflict(2306, "关键字冲突"),
	VMS_RTSP(2307, "VMS中Rtsp错误"),
	VMS_IpPort(2308, "VMS地址错误"),
	VMS_ServerNotRegister(2309, "VMS没有注册"),
	VMS_NotFoundNVD(2310, "没有找到NVD"),
	VMS_EncodePDU(2311, "PDU编码失败"),
	VMS_DecodePDU(2312, "PDU解码失败"),
	VMS_ServerReturnError(2313, "VMS返回失败"),
	License_DevTypeNotSupported(2401, "License不支持该设备类型"),
	License_ManufactureNotSupported(2402, "License不支持该厂商类型"),
	License_UserTypeNotSupported(2403, "License不支持该用户类型"),
	License_DevNumberNotSupported(2404, "该类型设备数量超出License限制"),
	License_UserNumberNotSupported(2405, "该类型用户数量超出License限制"),
	Common_Sdk_Timeout(10000, "超时"),
	Common_Sdk_NotFindOriReq(10001, "未找到原始请求错误"),
	Common_Sdk_ReqResNotReq(10002, "请求和回复命令对不起来错误"),
	Common_Sdk_ResNull(10003, "回复消息为空错误"),
	Common_Sdk_LengthOver(10004, "长度不够错误"),
	Common_Sdk_ManagerFailed(10005, "SDK初始化失败"),
	Common_Sdk_ThreadFailed(10006, "SDK启动线程失败"),
	Common_Sdk_UserCheckFailed(10007, "用户名和密码校验失败"),
	Common_Sdk_ResponseNull(10008, "返回消息体为空错误"),
	Common_Sdk_ConnectServerError(10009, "SDK连接服务错误"),
	VTDU_Sdk_NotConnect(11101, "未连接VTDU"),
	VTDU_Sdk_NotFindSession(11102, "未找到VTDU 会话"),
	VTDU_Sdk_NoRTSPConnect(11103, "未建立RTSP连接"),
	VTDU_Sdk_NoRTSPSetup(11104, "未进行Setup流程"),
	VTDU_Sdk_NoRTSPPlay(11105, "未进行Play流程"),
	VTDU_Sdk_RTPConnectFailed(11106, "码流接受对端连接失败"),
	VTDU_SDK_RtspConnect_Failed(11301, "RTSP链接失败"),
	FS_Sdk_GenerateGUIDFailed(11601, "生成文件GUID失败"),
	FS_Sdk_FileGUIDInvalid(11602, "文件GUID无效"),
	FS_Sdk_FileInfoWrong(11603, "文件信息填写错误"),
	FS_Sdk_FilePathWrong(11604, "文件信息填写错误"),
	FS_Sdk_FileOpenFailed(11605, "文件打开失败"),
	FS_Sdk_FileExist(11606, "本地同名文件已存在"),
	FS_Sdk_FileNotExist(11607, "上传/下载文件不存在"),
	FS_Sdk_FileSizeLimited(11608, "上传文件太大（超过2G）"),
	FS_Sdk_DiskFull(11609, "本地/服务器磁盘空间已满"),
	FS_Sdk_FileInUse(11610, "文件正在使用"),
	FS_Sdk_FileInfoLost(11611, "内存中文件信息丢失,不能写入数据库"),
	FS_Sdk_LogicWrong(11612, "逻辑错误，需要修改"),
	FS_Sdk_NewBufFailed(11613, "申请空间失败"),
	FS_Sdk_WriteDatabaseFailed(11614, "写入数据库失败"),
	FS_Sdk_FileDelFailed(11615, "文件删除失败"),
	FS_Sdk_FileDownloading(11616, "文件正在下载中"),
	FS_Sdk_MakeDirFailed(11617, "创建文件夹失败"),
	ADAPTER_SnapshotFailed(11801, "抓图失败"),
	CANNOT_FIND_FUNCTION(11900, "查找不到该函数"),
	CANNOT_LOGIN_MORE_PLATFORM(11901, "无法登陆更多的平台"),
	Not_Find_PlatForm(11902, "无法找到该平台"),
	PlatForm_OffLine(11903, "该平台离线"),
	Not_Find_DMU(11904, "无法找到DMU"),
	VOIP_DB_ERROR(20201, "数据库操作错误"),
	VOIP_DB_CONNECT_FAIL(20202, "数据库连接错误"),
	VOIP_OPERATETYPE_ERR(20203, "操作类型出错"),
	VOIP_VECTOR_EMPTY_ERR(20204, "配置队列为空"),
	VOIP_OVERWEIGHT_MAX_ERR(20205, "超过系统最大数目"),
	VOIP_EXTENSION_UNREGISTER_ERR(20206, "话机未注册或离线"),
	VOIP_EXTENSION_LIMIT_CALL_ERR(20207, "话机禁止呼叫"),
	VOIP_ORIGINAL_ERR(20208, "话机发起呼叫失败"),
	VOIP_EXTENSION_UNHOOK_ERR(20209, "话机未处于摘机呼叫状态"),
	VOIP_MEETING_RESOURCE_ERR(20210, "会议资源不足"),
	VOIP_EXTENSION_BUSY_ERR(20211, "用户忙"),
	VOIP_EXTENSION_CNT_OVERRIDE_ERR(20300, "超过系统支持的分机最大数量"),
	VOIP_EXTENSION_NUM_LENGTH_ERR(20301, "超过分机号码长度"),
	VOIP_EXTENSION_DEVICECODE_EXIST_ERR(20302, "该操作对应分机节点号已经存在"),
	VOIP_EXTENSION_EXIST_ERR(20303, "该操作对应分机主号已存在"),
	VOIP_EXTENSION_ALTERNATE_EXIST_ERR(20304, "该操作对应分机备号已经存在"),
	VOIP_EXTENSION_REQUIRE_ERR(20305, "申请分机失败"),
	VOIP_EXTENSION_OPERATE_PART_ERR(20306, "部分分机操作失败"),
	VOIP_EXTENSION_ADD_EMPTY_ERR(20307, "添加分机为空"),
	VOIP_EXTENSION_ADD_ALTERNATE_ERR(20308, "添加分机备号失败"),
	VOIP_EXTENSION_ADD_ERR(20309, "添加分机失败"),
	VOIP_EXTENSION_MODIFY_EMPTY_ERR(20310, "修改分机为空"),
	VOIP_EXTENSION_MODIFY_PHONE_NOFOUND_ERR(20311, "内存中找不到修改的分机号码"),
	VOIP_EXTENSION_MODIFY_DEVICECODE_NOEXIST_ERR(20312, "被修改的节点号对应分机不存在"),
	VOIP_EXTENSION_DELETE_PHONE_MEMORY_ERR(20313, "内存中删除分机失败"),
	VOIP_EXTENSION_QUERY_ORGCODE_EMPTY_ERR(20314, "分机查询组织结构为空"),
	VOIP_EXTENSION_QUERY_PAGE_OVERRIDE_ERR(20315, "分机查询页数过长"),
	VOIP_EXTENSION_QUERY_PAGE_INVALID_ERR(20316, "分机查询页数非法"),
	VOIP_EXTENSION_QUERY_NUMPERPAGE_INVALID_ERR(20317, "分机查询每页分机数非法"),
	VOIP_EXTENSION_QUERY_EMPTY_ERR(20318, "分机查询为空"),
	VOIP_EXTENSION_QUERY_OVERRIDE_ERR(20319, "分机查询分机个数超过总数"),
	VOIP_EXTENSION_MODIFY_INUSE_ERR(20320, "分机正在使用中禁止修改"),
	VOIP_EXTENSION_DELETE_INUSE_ERR(20321, "分机正在使用中禁止删除"),
	VOIP_EXTENSION_GROUP_SEQ_OVERRIDE_ERR(20400, "分机组序号过大"),
	VOIP_EXTENSION_GROUP_SEQ_EXIST_ERR(20401, "该序号分机组已存在"),
	VOIP_EXTENSION_GROUP_ID_OVERRIDE_ERR(20402, "查询分机组ID过大"),
	VOIP_EXTENSION_GROUP_SEQ_NOEXIST_ERR(20403, "分机组序号不存在"),
	VOIP_EXTENSION_GROUP_QUERY_NOEXISTINDB_ERR(20404, "查询分机组序号数据库中不存在"),
	VOIP_EXTENSION_GROUP_NUMBER_ERR(20405, "分机组对应的号码错误或不存在"),
	VOIP_EXTENSION_GROUP_NAME_ERR(20406, "分机组对应的名称重复"),
	VOIP_DISPATCH_SEQ_OVERRIDE_ERR(20450, "调度台序号过大"),
	VOIP_DISPATCH_CFG_NULL_ERR(20451, "调度台配置参数为空"),
	VOIP_DISPATCH_ADD_ID_EXIST_ERR(20452, "调度台添加ID已存在"),
	VOIP_DISPATCH_MODIFY_ATTENDANT_NOFOUND_ERR(20453, "总机未找到"),
	VOIP_DISPATCH_ID_NOEXIST_ERR(20454, "调度台查询该ID不存在"),
	VOIP_DISPATCH_LEFT_HAND_ERR(20455, "左手柄号码错误或不存在"),
	VOIP_DISPATCH_RIGHT_HAND_ERR(20456, "右手柄号码错误或不存在"),
	VOIP_DISPATCH_ONDUTY_ERR(20457, "夜服号码错误或不存在"),
	VOIP_DISPATCH_NO_MDF_ERR(20458, "调度在使用中不允许修改"),
	VOIP_DISPATCH_NO_DEL_ERR(20459, "调度在使用中不允许删除"),
	VOIP_DISPATCH_HAND_EQUAL_ERR(20460, "调度左右手柄号码不允许相同"),
	VOIP_DISPATCH_ONDUTY_EQUAL_ERR(20461, "调度左右手柄号码与夜服号码不允许相同"),
	VOIP_DISPATCH_NAME_ERR(20462, "调度的名称重复"),
	VOIP_DISPATCH_LOGIN_LOGGED_IN_ERR(20500, "调度台已登录"),
	VOIP_DISPATCH_LOGIN_LOGGED_IN_SELF_ERR(20501, "调度台已登录自身"),
	VOIP_DISPATCH_LOGIN_SEQ_OVERRIDE_ERR(20502, "调度台登陆调度台序号过大"),
	VOIP_DISPATCH_LOGIN_FAIL_ERR(20503, "调度台登陆失败"),
	VOIP_DISPATCH_STATUS_OFFLINE_ERR(20504, "调度台离线"),
	VOIP_DISPATCH_LOGOUT_ERR(20505, "调度台已登出"),
	VOIP_DISPATCH_LOGOUT_SELF_ERR(20506, "调度台非法登出"),
	VOIP_DISPATCH_LOGOUT_SEQ_OVERRIDE_ERR(20507, "调度台登出调度台序号过大"),
	VOIP_DISPATCH_LOGOUT_FAIL_ERR(20508, "调度台登出失败"),
	VOIP_DISPATCH_STAT_ERR(20525, "调度台状态获取失败"),
	VOIP_DISPATCH_ID_ERR(20526, "调度台ID不存在"),
	VOIP_DISPATCH_CALLER_NOEXIST_ERR(20527, "调度员号码不存在"),
	VOIP_DISPATCH_CALLER_STAT_FORBIDDEN_ERR(20528, "调度员状态不允许"),
	VOIP_DISPATCH_STYPE_FORBIDDEN_ERR(20529, "调度员会话不允许"),
	VOIP_DISPATCH_ADD_CONFERENCE_ERR(20530, "加入会议失败"),
	VOIP_LABELKEY_GROUP_OVERRIDE_ERR(20550, "调度台标签号组号不存在"),
	VOIP_LABELKEY_PAGE_INVALID_ERR(20551, "调度台页码数非法"),
	VOIP_LABELKEY_GROUPID_OVERRIDE_ERR(20552, "调度台标签对应话机组不存在"),
	VOIP_LABELKEY_PERPAGE_OVERRIDE_ERR(20553, "调度台每页分机数不存在"),
	VOIP_LABELKEY_ID_ERR(20554, "调度台标签不存在"),
	VOIP_KEYRIGHT_OCCUPIED_ERR(20555, "调度键权未占用"),
	VOIP_KEYRIGHT_OVERRIDE_ERR(20556, "键权键值非法"),
	VOIP_KEYRIGHT_CALL_ERR(20557, "呼叫键权失败"),
	VOIP_KEYRIGHT_UNHOOK_ERR(20558, "调度员未摘机"),
	VOIP_FUNCKEY_KEYTYPE_ERR(20600, "功能键键类型错误"),
	VOIP_FUNCKEY_KEYSEQ_ERR(20601, "按键不存在"),
	VOIP_FUNCKEY_CONF_MEMBER_MUTE_ERR(20602, "功能键禁言失败"),
	VOIP_FUNCKEY_MEETING_PRESS_ERR(20603, "会议状态按此键无效"),
	VOIP_FUNCKEY_GROUP_PRESS_ERR(20604, "组呼状态按此键无效"),
	VOIP_FUNCKEY_ALL_PRESS_ERR(20605, "集呼状态按此键无效"),
	VOIP_FUNCKEY_GENERAL_ERR(20606, "按保持键执行失败"),
	VOIP_FUNCKEY_TURN_PRESS_ERR(20607, "按转接键执行失败"),
	VOIP_FUNCKEY_IGNORE_ERR(20608, "按键无效"),
	VOIP_HOTKEY_KEYTYPE_ERR(20650, "快捷键键类型错误"),
	VOIP_HOTKEY_KEYSEQ_OVERRIDE_ERR(20651, "快捷键键序不存在"),
	VOIP_HOTKEY_GROUP_EMPTY_ERR(20652, "当前话机组为空"),
	VOIP_NUMBER_CONVERT_OPERATE_TYPE_ERR(20700, "号码变换操作类型不存在"),
	VOIP_NUMBER_CONVERT_DATA_INVALID_ERR(20701, "号码变换数据不合法"),
	VOIP_NUMBER_CONVERT_QUERY_ID_OVERRIDE_ERR(20702, "号码变换查询ID过大"),
	VOIP_NUMBER_CONVERT_DELETE_ID_OVERRIDE_ERR(20703, "号码变换删除ID过大"),
	VOIP_NUMBER_CONVERT_MODIFY_ID_OVERRIDE_ERR(20704, "号码变换修改ID过大"),
	VOIP_CONFERENCE_SET_REFRESH_ERR(20750, "会议号码刷新内存错误"),
	VOIP_CONFERENCE_SET_INVALID_DATA_ERR(20751, "会议数据不合法"),
	VOIP_CONFERENCE_SET_NUMBER_EXIST_ERR(20752, "会议号码与用户号码重复"),
	VOIP_ATTENDANT_OPERATE_TYPE_ERR(20800, "总机设置类型不存在"),
	VOIP_ATTENDANT_CNT_OVERRIDE_ERR(20801, "总机过多，超过100个"),
	VOIP_ATTENDANT_QUERY_ORGCODE_EMPTY_ERR(20802, "总机查询组织结构为空"),
	VOIP_ATTENDANT_QUERY_EMPTY_ERR(20803, "总机查询为空"),
	VOIP_ATTENDANT_QUERY_ID_OVERRIDE_ERR(20804, "总机查询ID过大"),
	VOIP_ATTENDANT_ADD_ERR(20805, "添加总机失败"),
	VOIP_ATTENDANT_DELETE_ERR(20806, "删除总机失败"),
	VOIP_ATTENDANT_DELETE_ID_OVERRIDE_ERR(20807, "总机删除ID过大"),
	VOIP_ATTENDANT_MODIFY_PHONE_NOFOUND_ERR(20808, "内存中找不到修改的总机号码"),
	VOIP_ATTENDANT_MODIFY_ID_OVERRIDE_ERR(20809, "总机修改ID过大"),
	VOIP_ATTENDANT_EXIST_ERR(20810, "该操作对应总机号已存在"),
	VOIP_ATTENDANT_EXIST_INEXTENSION_ERR(20811, "该操作对应总机号在分机中已存在"),
	VOIP_ATTENDANT_ADD_EMPTY_ERR(20812, "添加总机为空"),
	VOIP_FXSO_TYPE_ERR(20850, "FXSO查询FXS/FSO类型出错"),
	VOIP_FXSO_NUMBER_EXIST_ERR(20851, "FXSO同一网关下该号码已经存在"),
	VOIP_FXSO_SID_NOTEXIST_ERR(20852, "FXSO同一网关下修改删除时该SID不存在"),
	VOIP_FXSO_GATEWAY_ID_ERR(20853, "FXSO参数查询时网关ID出错"),
	VOIP_FXSO_QUERY_EMPTY_ERR(20854, "FXSO参数查询时查询记录为空"),
	VOIP_FXSO_OPERATE_TYPE_ERR(20855, "FXSO参数设置类型不存在"),
	VOIP_FXSO_CNT_OVERRIDE_ERR(20856, "FXSO参数过多，超过100个"),
	VOIP_FXSO_ADD_ERR(20857, "添加FXSO参数失败"),
	VOIP_FXSO_DELETE_ERR(20858, "删除FXSO参数失败"),
	VOIP_FXSO_DELETE_ID_OVERRIDE_ERR(20859, "FXSO参数删除ID过大"),
	VOIP_FXSO_MODIFY_ID_OVERRIDE_ERR(20860, "FXSO参数修改ID过大"),
	VOIP_FXSO_NUMBER_ERR(20861, "FXS/FXO号码出错"),
	VOIP_FXSO_SAME_NUMBER_ERR(20862, "FXS/FXO号码重复"),
	VOIP_GW_ID_ERR(20900, "网关ID不存在"),
	VOIP_GW_ID_OVERWEIGHT_ERR(20901, "网关ID超出最大值"),
	VOIP_GW_ID_REQUIRE_ERR(20902, "网关ID申请失败"),
	VOIP_GW_IDENTITY_ERR(20903, "网关标识出错"),
	VOIP_GW_NUM_ERR(20904, "网关注册号码重复"),
	VOIP_GW_INUSED_ERR(20905, "网关使用中禁止修改或删除"),
	VOIP_GW_SAME_IP_ERR(20906, "网关IP重复"),
	VOIP_TRUNK_CFG_NULL_ERR(20950, "中继配置指针为空"),
	VOIP_TRUNK_ID_OVERRIDE_ERR(20951, "中继ID过大"),
	VOIP_TRUNK_CONFIG_IDENTIFY_ERR(20952, "中继配置标识号错误"),
	VOIP_TRUNK_CONFIG_REFRESH_ERR(20953, "中继配置内存更新失败"),
	VOIP_TRUNK_TID_REQUIRE_FAIL(20954, "中继ID申请失败"),
	VOIP_TRUNK_CONFIG_IDENTIFY_EXIST_ERR(20955, "中继标识号重复"),
	VOIP_TRUNK_TID_NOEXIST_ERR(20956, "中继tId不存在"),
	VOIP_CIDID_IDENTIFYTYPE_ERR(20957, "CID/DID所属类型(0 中继，1网关)错误"),
	VOIP_CIDID_CFG_NULL_ERR(20958, "CID/DID配置指针指针为空"),
	VOIP_CIDID_CDID_REQUIRE_FAIL(20959, "申请cdid失败"),
	VOIP_CIDID_CONFIG_REFRESH_ERR(20960, "CID/DID配置内存更新失败"),
	VOIP_CIDID_IDENTIFYID_NOEXIST_ERR(20961, "CID/DID识别号不存在"),
	VOIP_CIDID_CDID_OVERRIDE_ERR(20962, "CID/DID的索引ID过大"),
	VOIP_CIDID_IDENTIFYID_OVERRIDE_ERR(20963, "CID/DID识别号过大"),
	VOIP_CIDID_CDID_NOEXIST_ERR(20964, "CID/DID的索引ID不存在"),
	VOIP_TRUNK_GW_QUERY_ERR(20965, "中继/网关组查询均失败"),
	VOIP_TRUNK_SAME_IP_ERR(20966, "中继中存在相同的IP"),
	VOIP_RT_ID_ERR(21000, "路由策略ID不存在"),
	VOIP_RT_NAME_ERR(21001, "路由策略名称出错"),
	VOIP_RT_ID_OVERWEIGHT_ERR(21002, "路由策略ID超出最大值"),
	VOIP_RT_ID_REQUIRE_ERR(21003, "路由策略ID申请失败"),
	VOIP_RT_CONTEXT_ERR(21004, "路由策略内容(中继/网关组)出错"),
	VOIP_RT_INUSED_ERR(21005, "路由策略使用中禁止修改或删除"),
	VOIP_RT_SAME_TG_ERR(21006, "路由策略存在相同的网关或中继"),
	VOIP_RT_SAME_PRORITY_ERR(21007, "路由策略存在相同的优先级"),
	VOIP_DP_ID_ERR(21050, "拨号方案ID不存在"),
	VOIP_DP_NAME_ERR(21051, "拨号方案名称出错"),
	VOIP_DP_ID_OVERWEIGHT_ERR(21052, "拨号方案ID超出最大值"),
	VOIP_DP_ID_REQUIRE_ERR(21053, "拨号方案ID申请失败"),
	VOIP_DP_CONTEXT_ERR(21054, "拨号方案内容(匹配信息为空)出错"),
	VOIP_DP_INUSED_ERR(21055, "拨号方案使用中禁止修改或删除"),
	VOIP_DP_SAME_RT_ERR(21056, "拨号方案使用中存在相同的路由策略"),
	VOIP_VC_NAME_ERR(21100, "视频会议预案名称出错"),
	VOIP_VC_ID_OVERWEIGHT_ERR(21101, "视频会议预案ID超出最大值"),
	VOIP_VC_ID_ERR(21102, "视频会议预案ID不存在"),
	VOIP_VC_ID_REQUIRE_ERR(21103, "视频会议预案ID申请失败"),
	VOIP_VC_AMOUNT_ERR(21104, "视频会议预案容纳人数过大"),
	VOIP_VC_INUSED_ERR(21105, "视频会议预案使用中禁止修改或删除"),
	VOIP_VC_DEVICECODE_ERR(21106, "视频会议预案主叫设备号不存在"),
	VOIP_VC_AMOUNT_CNT_ERR(21107, "视频会议预案容纳人数不能小于现有的成员数"),
	VOIP_VM_ID_ERR(21120, "视频会议成员ID不存在"),
	VOIP_VM_ID_REQUIRE_ERR(21121, "视频会议成员ID申请失败"),
	VOIP_VM_NUMBER_ERR(21122, "视频会议成员重复"),
	VOIP_VM_INUSED_ERR(21123, "视频会议成员用中禁止修改或删除"),
	VOIP_VM_DEVICECODE_ERR(21124, "视频会议成员设备号不存在"),
	VOIP_VCOPT_SEIZE_ERR(21150, "视频会议已开始"),
	VOIP_VCOPT_FREE_ERR(21151, "视频会议未开始"),
	VOIP_VCOPT_CALLER_ERR(21152, "视频会议发起者不存在"),
	VOIP_VCOPT_CALLER_ITSELF_ERR(21153, "视频会议发起者不是自身"),
	VOIP_VCOPT_UNKNOWN_ERR(21154, "视频会议未知错误"),
	VOIP_VCOPT_INVITEE_ERR(21155, "视频会议受邀方不存在"),
	VOIP_VCOPT_INVITED_ERR(21156, "视频会议成员已邀请"),
	VOIP_VCOPT_KICKED_ERR(21157, "视频会议成员已踢出"),
	VOIP_VCOPT_UNMUTED_ERR(21158, "视频会议成员已发言"),
	VOIP_VCOPT_MUTED_ERR(21159, "视频会议成员已禁言"),
	VOIP_VCOPT_ORG_ERR(21160, "视频会议室组织节点为空"),
	VOIP_VCOPT_MEMBER_FULL_ERR(21161, "视频会议室人数已满"),
	VOIP_VCOPT_DIFFERENCE_ERR(21162, "视频会议发言用户不在会议中"),
	VOIP_VCOPT_SESSION_ERR(21163, "视频会议会话类型不允许"),
	VOIP_VCOPT_SPEAKER_STAT_ERR(21164, "视频会议发起者状态不允许"),
	VOIP_VCOPT_SPEAKEE_STAT_ERR(21165, "视频会议发言者状态不允许"),
	VOIP_TALK_ERR(21200, "视频对讲错误"),
	VOIP_TALK_CALLER_ERR(21201, "视频对讲发起者为空"),
	VOIP_TALK_CALLEE_ERR(21202, "视频对讲接收者为空"),
	VOIP_TALK_UNKNOWN_ERR(21203, "视频对讲未知错误"),
	VOIP_TALK_CALLER_SESSION_ERR(21204, "视频对讲主机所处会话错误"),
	VOIP_TALK_FREE_ERR(21205, "视频对讲释放错误"),
	LKU_ServerUnavailable(30201, "LKU服务不可用"),
	SOFTPHONE_INIT_SUCESS(40000, "SOFTPHONE初始成功"),
	SOFTPHONE_CREATE_RESOURCE_FAIL(40001, "SOFTPHONE创建资源失败"),
	SOFTPHONE_INIT_FAIL(40002, "SOFTPHONE初始化失败"),
	SOFTPHONE_CREATE_SIP_FAIL(40003, "SOFTPHONE创建SIP端口失败"),
	SOFTPHONE_STARTUP_RESOURCE_FAIL(40004, "SOFTPHONE启动资源失败"),
	SOFTPHONE_CALLOUT_SUCESS(40010, "SOFTPHONE拨号成功"),
	SOFTPHONE_CALLOUT_NOTINIT(40011, "SOFTPHONE拨号系统未初始化"),
	SOFTPHONE_CALLOUT_HASSESSION(40012, "SOFTPHONE拨号已经存在会话"),
	SOFTPHONE_CALLOUT_EMPTY(40013, "SOFTPHONE拨号被叫号码不能为空"),
	SOFTPHONE_CALLOUT_NOCOUNT(40014, "SOFTPHONE拨号未设置账户,或账户未注册成功"),
	SOFTPHONE_CALLOUT_IDFAIL(40015, "SOFTPHONE拨号呼叫ID检查失败"),
	SOFTPHONE_CALLOUT_EXECUTEFAIL(40016, "SOFTPHONE拨号调用呼叫失败");
	private int code;
	private String msg;
	SDKExceptionDefine(int code, String msg){
		this.code = code;
		this.msg = msg;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public static String getMsg(int code){
		for(int i = 0; i < SDKExceptionDefine.values().length; i++){
			if(SDKExceptionDefine.values()[i].getCode() == code){
				return SDKExceptionDefine.values()[i].getMsg()+"("+code+")";
			}
		}
		return code+"";
	}
	public static final String RESULT_OK = "OK";
	public static final String RESULT_ERROR = "ERROR";
}
