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


class TaskFail(object):
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
        'start_date': 'str',
        'end_date': 'str',
        'duration': 'int'
    }

    attribute_map = {
        'task_id': 'task_id',
        'dag_id': 'dag_id',
        'execution_date': 'execution_date',
        'start_date': 'start_date',
        'end_date': 'end_date',
        'duration': 'duration'
    }

    def __init__(self, task_id=None, dag_id=None, execution_date=None, start_date=None, end_date=None, duration=None, local_vars_configuration=None):  # noqa: E501
        """TaskFail - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._task_id = None
        self._dag_id = None
        self._execution_date = None
        self._start_date = None
        self._end_date = None
        self._duration = None
        self.discriminator = None

        if task_id is not None:
            self.task_id = task_id
        if dag_id is not None:
            self.dag_id = dag_id
        if execution_date is not None:
            self.execution_date = execution_date
        if start_date is not None:
            self.start_date = start_date
        if end_date is not None:
            self.end_date = end_date
        if duration is not None:
            self.duration = duration

    @property
    def task_id(self):
        """Gets the task_id of this TaskFail.  # noqa: E501


        :return: The task_id of this TaskFail.  # noqa: E501
        :rtype: str
        """
        return self._task_id

    @task_id.setter
    def task_id(self, task_id):
        """Sets the task_id of this TaskFail.


        :param task_id: The task_id of this TaskFail.  # noqa: E501
        :type: str
        """

        self._task_id = task_id

    @property
    def dag_id(self):
        """Gets the dag_id of this TaskFail.  # noqa: E501


        :return: The dag_id of this TaskFail.  # noqa: E501
        :rtype: str
        """
        return self._dag_id

    @dag_id.setter
    def dag_id(self, dag_id):
        """Sets the dag_id of this TaskFail.


        :param dag_id: The dag_id of this TaskFail.  # noqa: E501
        :type: str
        """

        self._dag_id = dag_id

    @property
    def execution_date(self):
        """Gets the execution_date of this TaskFail.  # noqa: E501


        :return: The execution_date of this TaskFail.  # noqa: E501
        :rtype: str
        """
        return self._execution_date

    @execution_date.setter
    def execution_date(self, execution_date):
        """Sets the execution_date of this TaskFail.


        :param execution_date: The execution_date of this TaskFail.  # noqa: E501
        :type: str
        """

        self._execution_date = execution_date

    @property
    def start_date(self):
        """Gets the start_date of this TaskFail.  # noqa: E501


        :return: The start_date of this TaskFail.  # noqa: E501
        :rtype: str
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date):
        """Sets the start_date of this TaskFail.


        :param start_date: The start_date of this TaskFail.  # noqa: E501
        :type: str
        """

        self._start_date = start_date

    @property
    def end_date(self):
        """Gets the end_date of this TaskFail.  # noqa: E501


        :return: The end_date of this TaskFail.  # noqa: E501
        :rtype: str
        """
        return self._end_date

    @end_date.setter
    def end_date(self, end_date):
        """Sets the end_date of this TaskFail.


        :param end_date: The end_date of this TaskFail.  # noqa: E501
        :type: str
        """

        self._end_date = end_date

    @property
    def duration(self):
        """Gets the duration of this TaskFail.  # noqa: E501


        :return: The duration of this TaskFail.  # noqa: E501
        :rtype: int
        """
        return self._duration

    @duration.setter
    def duration(self, duration):
        """Sets the duration of this TaskFail.


        :param duration: The duration of this TaskFail.  # noqa: E501
        :type: int
        """

        self._duration = duration

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
        if not isinstance(other, TaskFail):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TaskFail):
            return True

        return self.to_dict() != other.to_dict()
