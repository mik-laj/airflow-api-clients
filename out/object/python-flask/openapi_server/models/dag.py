# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.schedule_interval import ScheduleInterval
from openapi_server.models.tag import Tag
from openapi_server import util

from openapi_server.models.schedule_interval import ScheduleInterval  # noqa: E501
from openapi_server.models.tag import Tag  # noqa: E501

class DAG(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, dag_id=None, root_dag_id=None, is_paused=None, is_subdag=None, fileloc=None, file_token=None, owners=None, description=None, schedule_interval=None, tags=None):  # noqa: E501
        """DAG - a model defined in OpenAPI

        :param dag_id: The dag_id of this DAG.  # noqa: E501
        :type dag_id: str
        :param root_dag_id: The root_dag_id of this DAG.  # noqa: E501
        :type root_dag_id: str
        :param is_paused: The is_paused of this DAG.  # noqa: E501
        :type is_paused: bool
        :param is_subdag: The is_subdag of this DAG.  # noqa: E501
        :type is_subdag: bool
        :param fileloc: The fileloc of this DAG.  # noqa: E501
        :type fileloc: str
        :param file_token: The file_token of this DAG.  # noqa: E501
        :type file_token: str
        :param owners: The owners of this DAG.  # noqa: E501
        :type owners: List[str]
        :param description: The description of this DAG.  # noqa: E501
        :type description: str
        :param schedule_interval: The schedule_interval of this DAG.  # noqa: E501
        :type schedule_interval: ScheduleInterval
        :param tags: The tags of this DAG.  # noqa: E501
        :type tags: List[Tag]
        """
        self.openapi_types = {
            'dag_id': str,
            'root_dag_id': str,
            'is_paused': bool,
            'is_subdag': bool,
            'fileloc': str,
            'file_token': str,
            'owners': List[str],
            'description': str,
            'schedule_interval': ScheduleInterval,
            'tags': List[Tag]
        }

        self.attribute_map = {
            'dag_id': 'dag_id',
            'root_dag_id': 'root_dag_id',
            'is_paused': 'is_paused',
            'is_subdag': 'is_subdag',
            'fileloc': 'fileloc',
            'file_token': 'file_token',
            'owners': 'owners',
            'description': 'description',
            'schedule_interval': 'schedule_interval',
            'tags': 'tags'
        }

        self._dag_id = dag_id
        self._root_dag_id = root_dag_id
        self._is_paused = is_paused
        self._is_subdag = is_subdag
        self._fileloc = fileloc
        self._file_token = file_token
        self._owners = owners
        self._description = description
        self._schedule_interval = schedule_interval
        self._tags = tags

    @classmethod
    def from_dict(cls, dikt) -> 'DAG':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DAG of this DAG.  # noqa: E501
        :rtype: DAG
        """
        return util.deserialize_model(dikt, cls)

    @property
    def dag_id(self):
        """Gets the dag_id of this DAG.


        :return: The dag_id of this DAG.
        :rtype: str
        """
        return self._dag_id

    @dag_id.setter
    def dag_id(self, dag_id):
        """Sets the dag_id of this DAG.


        :param dag_id: The dag_id of this DAG.
        :type dag_id: str
        """

        self._dag_id = dag_id

    @property
    def root_dag_id(self):
        """Gets the root_dag_id of this DAG.


        :return: The root_dag_id of this DAG.
        :rtype: str
        """
        return self._root_dag_id

    @root_dag_id.setter
    def root_dag_id(self, root_dag_id):
        """Sets the root_dag_id of this DAG.


        :param root_dag_id: The root_dag_id of this DAG.
        :type root_dag_id: str
        """

        self._root_dag_id = root_dag_id

    @property
    def is_paused(self):
        """Gets the is_paused of this DAG.


        :return: The is_paused of this DAG.
        :rtype: bool
        """
        return self._is_paused

    @is_paused.setter
    def is_paused(self, is_paused):
        """Sets the is_paused of this DAG.


        :param is_paused: The is_paused of this DAG.
        :type is_paused: bool
        """

        self._is_paused = is_paused

    @property
    def is_subdag(self):
        """Gets the is_subdag of this DAG.


        :return: The is_subdag of this DAG.
        :rtype: bool
        """
        return self._is_subdag

    @is_subdag.setter
    def is_subdag(self, is_subdag):
        """Sets the is_subdag of this DAG.


        :param is_subdag: The is_subdag of this DAG.
        :type is_subdag: bool
        """

        self._is_subdag = is_subdag

    @property
    def fileloc(self):
        """Gets the fileloc of this DAG.


        :return: The fileloc of this DAG.
        :rtype: str
        """
        return self._fileloc

    @fileloc.setter
    def fileloc(self, fileloc):
        """Sets the fileloc of this DAG.


        :param fileloc: The fileloc of this DAG.
        :type fileloc: str
        """

        self._fileloc = fileloc

    @property
    def file_token(self):
        """Gets the file_token of this DAG.

        The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change.   # noqa: E501

        :return: The file_token of this DAG.
        :rtype: str
        """
        return self._file_token

    @file_token.setter
    def file_token(self, file_token):
        """Sets the file_token of this DAG.

        The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change.   # noqa: E501

        :param file_token: The file_token of this DAG.
        :type file_token: str
        """

        self._file_token = file_token

    @property
    def owners(self):
        """Gets the owners of this DAG.


        :return: The owners of this DAG.
        :rtype: List[str]
        """
        return self._owners

    @owners.setter
    def owners(self, owners):
        """Sets the owners of this DAG.


        :param owners: The owners of this DAG.
        :type owners: List[str]
        """

        self._owners = owners

    @property
    def description(self):
        """Gets the description of this DAG.


        :return: The description of this DAG.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this DAG.


        :param description: The description of this DAG.
        :type description: str
        """

        self._description = description

    @property
    def schedule_interval(self):
        """Gets the schedule_interval of this DAG.


        :return: The schedule_interval of this DAG.
        :rtype: ScheduleInterval
        """
        return self._schedule_interval

    @schedule_interval.setter
    def schedule_interval(self, schedule_interval):
        """Sets the schedule_interval of this DAG.


        :param schedule_interval: The schedule_interval of this DAG.
        :type schedule_interval: ScheduleInterval
        """

        self._schedule_interval = schedule_interval

    @property
    def tags(self):
        """Gets the tags of this DAG.


        :return: The tags of this DAG.
        :rtype: List[Tag]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """Sets the tags of this DAG.


        :param tags: The tags of this DAG.
        :type tags: List[Tag]
        """

        self._tags = tags
