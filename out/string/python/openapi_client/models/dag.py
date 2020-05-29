# coding: utf-8

"""
    Airflow API (Stable)

    Apache Airflow management API.  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: dev@airflow.apache.org
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from openapi_client.configuration import Configuration


class DAG(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'dag_id': 'str',
        'root_dag_id': 'str',
        'is_paused': 'bool',
        'is_subdag': 'bool',
        'fileloc': 'str',
        'file_token': 'str',
        'owners': 'list[str]',
        'description': 'str',
        'schedule_interval': 'OneOfScheduleInterval',
        'tags': 'list[Tag]'
    }

    attribute_map = {
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

    def __init__(self, dag_id=None, root_dag_id=None, is_paused=None, is_subdag=None, fileloc=None, file_token=None, owners=None, description=None, schedule_interval=None, tags=None, local_vars_configuration=None):  # noqa: E501
        """DAG - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._dag_id = None
        self._root_dag_id = None
        self._is_paused = None
        self._is_subdag = None
        self._fileloc = None
        self._file_token = None
        self._owners = None
        self._description = None
        self._schedule_interval = None
        self._tags = None
        self.discriminator = None

        if dag_id is not None:
            self.dag_id = dag_id
        if root_dag_id is not None:
            self.root_dag_id = root_dag_id
        if is_paused is not None:
            self.is_paused = is_paused
        if is_subdag is not None:
            self.is_subdag = is_subdag
        if fileloc is not None:
            self.fileloc = fileloc
        if file_token is not None:
            self.file_token = file_token
        if owners is not None:
            self.owners = owners
        if description is not None:
            self.description = description
        if schedule_interval is not None:
            self.schedule_interval = schedule_interval
        if tags is not None:
            self.tags = tags

    @property
    def dag_id(self):
        """Gets the dag_id of this DAG.  # noqa: E501


        :return: The dag_id of this DAG.  # noqa: E501
        :rtype: str
        """
        return self._dag_id

    @dag_id.setter
    def dag_id(self, dag_id):
        """Sets the dag_id of this DAG.


        :param dag_id: The dag_id of this DAG.  # noqa: E501
        :type: str
        """

        self._dag_id = dag_id

    @property
    def root_dag_id(self):
        """Gets the root_dag_id of this DAG.  # noqa: E501


        :return: The root_dag_id of this DAG.  # noqa: E501
        :rtype: str
        """
        return self._root_dag_id

    @root_dag_id.setter
    def root_dag_id(self, root_dag_id):
        """Sets the root_dag_id of this DAG.


        :param root_dag_id: The root_dag_id of this DAG.  # noqa: E501
        :type: str
        """

        self._root_dag_id = root_dag_id

    @property
    def is_paused(self):
        """Gets the is_paused of this DAG.  # noqa: E501


        :return: The is_paused of this DAG.  # noqa: E501
        :rtype: bool
        """
        return self._is_paused

    @is_paused.setter
    def is_paused(self, is_paused):
        """Sets the is_paused of this DAG.


        :param is_paused: The is_paused of this DAG.  # noqa: E501
        :type: bool
        """

        self._is_paused = is_paused

    @property
    def is_subdag(self):
        """Gets the is_subdag of this DAG.  # noqa: E501


        :return: The is_subdag of this DAG.  # noqa: E501
        :rtype: bool
        """
        return self._is_subdag

    @is_subdag.setter
    def is_subdag(self, is_subdag):
        """Sets the is_subdag of this DAG.


        :param is_subdag: The is_subdag of this DAG.  # noqa: E501
        :type: bool
        """

        self._is_subdag = is_subdag

    @property
    def fileloc(self):
        """Gets the fileloc of this DAG.  # noqa: E501


        :return: The fileloc of this DAG.  # noqa: E501
        :rtype: str
        """
        return self._fileloc

    @fileloc.setter
    def fileloc(self, fileloc):
        """Sets the fileloc of this DAG.


        :param fileloc: The fileloc of this DAG.  # noqa: E501
        :type: str
        """

        self._fileloc = fileloc

    @property
    def file_token(self):
        """Gets the file_token of this DAG.  # noqa: E501

        The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change.   # noqa: E501

        :return: The file_token of this DAG.  # noqa: E501
        :rtype: str
        """
        return self._file_token

    @file_token.setter
    def file_token(self, file_token):
        """Sets the file_token of this DAG.

        The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change.   # noqa: E501

        :param file_token: The file_token of this DAG.  # noqa: E501
        :type: str
        """

        self._file_token = file_token

    @property
    def owners(self):
        """Gets the owners of this DAG.  # noqa: E501


        :return: The owners of this DAG.  # noqa: E501
        :rtype: list[str]
        """
        return self._owners

    @owners.setter
    def owners(self, owners):
        """Sets the owners of this DAG.


        :param owners: The owners of this DAG.  # noqa: E501
        :type: list[str]
        """

        self._owners = owners

    @property
    def description(self):
        """Gets the description of this DAG.  # noqa: E501


        :return: The description of this DAG.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this DAG.


        :param description: The description of this DAG.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def schedule_interval(self):
        """Gets the schedule_interval of this DAG.  # noqa: E501


        :return: The schedule_interval of this DAG.  # noqa: E501
        :rtype: OneOfScheduleInterval
        """
        return self._schedule_interval

    @schedule_interval.setter
    def schedule_interval(self, schedule_interval):
        """Sets the schedule_interval of this DAG.


        :param schedule_interval: The schedule_interval of this DAG.  # noqa: E501
        :type: OneOfScheduleInterval
        """

        self._schedule_interval = schedule_interval

    @property
    def tags(self):
        """Gets the tags of this DAG.  # noqa: E501


        :return: The tags of this DAG.  # noqa: E501
        :rtype: list[Tag]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """Sets the tags of this DAG.


        :param tags: The tags of this DAG.  # noqa: E501
        :type: list[Tag]
        """

        self._tags = tags

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, DAG):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, DAG):
            return True

        return self.to_dict() != other.to_dict()
