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

from airflow_client.configuration import Configuration


class SLAMiss(object):
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
        'task_id': 'str',
        'dag_id': 'str',
        'execution_date': 'str',
        'email_sent': 'bool',
        'timestamp': 'str',
        'description': 'str',
        'notification_sent': 'bool'
    }

    attribute_map = {
        'task_id': 'task_id',
        'dag_id': 'dag_id',
        'execution_date': 'execution_date',
        'email_sent': 'email_sent',
        'timestamp': 'timestamp',
        'description': 'description',
        'notification_sent': 'notification_sent'
    }

    def __init__(self, task_id=None, dag_id=None, execution_date=None, email_sent=None, timestamp=None, description=None, notification_sent=None, local_vars_configuration=None):  # noqa: E501
        """SLAMiss - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._task_id = None
        self._dag_id = None
        self._execution_date = None
        self._email_sent = None
        self._timestamp = None
        self._description = None
        self._notification_sent = None
        self.discriminator = None

        if task_id is not None:
            self.task_id = task_id
        if dag_id is not None:
            self.dag_id = dag_id
        if execution_date is not None:
            self.execution_date = execution_date
        if email_sent is not None:
            self.email_sent = email_sent
        if timestamp is not None:
            self.timestamp = timestamp
        if description is not None:
            self.description = description
        if notification_sent is not None:
            self.notification_sent = notification_sent

    @property
    def task_id(self):
        """Gets the task_id of this SLAMiss.  # noqa: E501


        :return: The task_id of this SLAMiss.  # noqa: E501
        :rtype: str
        """
        return self._task_id

    @task_id.setter
    def task_id(self, task_id):
        """Sets the task_id of this SLAMiss.


        :param task_id: The task_id of this SLAMiss.  # noqa: E501
        :type: str
        """

        self._task_id = task_id

    @property
    def dag_id(self):
        """Gets the dag_id of this SLAMiss.  # noqa: E501


        :return: The dag_id of this SLAMiss.  # noqa: E501
        :rtype: str
        """
        return self._dag_id

    @dag_id.setter
    def dag_id(self, dag_id):
        """Sets the dag_id of this SLAMiss.


        :param dag_id: The dag_id of this SLAMiss.  # noqa: E501
        :type: str
        """

        self._dag_id = dag_id

    @property
    def execution_date(self):
        """Gets the execution_date of this SLAMiss.  # noqa: E501


        :return: The execution_date of this SLAMiss.  # noqa: E501
        :rtype: str
        """
        return self._execution_date

    @execution_date.setter
    def execution_date(self, execution_date):
        """Sets the execution_date of this SLAMiss.


        :param execution_date: The execution_date of this SLAMiss.  # noqa: E501
        :type: str
        """

        self._execution_date = execution_date

    @property
    def email_sent(self):
        """Gets the email_sent of this SLAMiss.  # noqa: E501


        :return: The email_sent of this SLAMiss.  # noqa: E501
        :rtype: bool
        """
        return self._email_sent

    @email_sent.setter
    def email_sent(self, email_sent):
        """Sets the email_sent of this SLAMiss.


        :param email_sent: The email_sent of this SLAMiss.  # noqa: E501
        :type: bool
        """

        self._email_sent = email_sent

    @property
    def timestamp(self):
        """Gets the timestamp of this SLAMiss.  # noqa: E501


        :return: The timestamp of this SLAMiss.  # noqa: E501
        :rtype: str
        """
        return self._timestamp

    @timestamp.setter
    def timestamp(self, timestamp):
        """Sets the timestamp of this SLAMiss.


        :param timestamp: The timestamp of this SLAMiss.  # noqa: E501
        :type: str
        """

        self._timestamp = timestamp

    @property
    def description(self):
        """Gets the description of this SLAMiss.  # noqa: E501


        :return: The description of this SLAMiss.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this SLAMiss.


        :param description: The description of this SLAMiss.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def notification_sent(self):
        """Gets the notification_sent of this SLAMiss.  # noqa: E501


        :return: The notification_sent of this SLAMiss.  # noqa: E501
        :rtype: bool
        """
        return self._notification_sent

    @notification_sent.setter
    def notification_sent(self, notification_sent):
        """Sets the notification_sent of this SLAMiss.


        :param notification_sent: The notification_sent of this SLAMiss.  # noqa: E501
        :type: bool
        """

        self._notification_sent = notification_sent

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
        if not isinstance(other, SLAMiss):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, SLAMiss):
            return True

        return self.to_dict() != other.to_dict()
