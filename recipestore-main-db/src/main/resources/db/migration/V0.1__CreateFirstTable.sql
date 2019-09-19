create table REVINFO (REV number(10,0) not null, REVTSTMP number(19,0), primary key (REV));
create table USER_ENTITY (ID number(19,0) not null, LOGIN_ID number(19,0) not null, LOGIN_TIME timestamp not null, MODIFICATION_ID number(19,0) not null, MODIFICATION_TIME timestamp not null, NAME varchar2(255 char), primary key (ID));
create table USER_ENTITY_AUD (ID number(19,0) not null, REV number(10,0) not null, REVTYPE number(3,0), LOGIN_ID number(19,0), LOGIN_TIME timestamp, MODIFICATION_ID number(19,0), NAME varchar2(255 char), primary key (ID, REV));
create sequence USER_ENTITY_SEQ start with 1 increment by 1;
alter table USER_ENTITY_AUD add constraint FKc6jscswix1qvlm2axkg1uu998 foreign key (REV) references REVINFO;
