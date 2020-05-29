# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server import util


class Error(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, type=None, title=None, status=None, details=None, instance=None):  # noqa: E501
        """Error - a model defined in OpenAPI

        :param type: The type of this Error.  # noqa: E501
        :type type: str
        :param title: The title of this Error.  # noqa: E501
        :type title: str
        :param status: The status of this Error.  # noqa: E501
        :type status: float
        :param details: The details of this Error.  # noqa: E501
        :type details: str
        :param instance: The instance of this Error.  # noqa: E501
        :type instance: str
        """
        self.openapi_types = {
            'type': str,
            'title': str,
            'status': float,
            'details': str,
            'instance': str
        }

        self.attribute_map = {
            'type': 'type',
            'title': 'title',
            'status': 'status',
            'details': 'details',
            'instance': 'instance'
        }

        self._type = type
        self._title = title
        self._status = status
        self._details = details
        self._instance = instance

    @classmethod
    def from_dict(cls, dikt) -> 'Error':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Error of this Error.  # noqa: E501
        :rtype: Error
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self):
        """Gets the type of this Error.

        A URI reference [RFC3986] that identifies the problem type. This specification encourages that, when dereferenced, it provide human-readable documentation for the problem type.   # noqa: E501

        :return: The type of this Error.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this Error.

        A URI reference [RFC3986] that identifies the problem type. This specification encourages that, when dereferenced, it provide human-readable documentation for the problem type.   # noqa: E501

        :param type: The type of this Error.
        :type type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501

        self._type = type

    @property
    def title(self):
        """Gets the title of this Error.

        A short, human-readable summary of the problem  type.  # noqa: E501

        :return: The title of this Error.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title):
        """Sets the title of this Error.

        A short, human-readable summary of the problem  type.  # noqa: E501

        :param title: The title of this Error.
        :type title: str
        """
        if title is None:
            raise ValueError("Invalid value for `title`, must not be `None`")  # noqa: E501

        self._title = title

    @property
    def status(self):
        """Gets the status of this Error.

        The HTTP status code generated by the API server for this occurrence of the problem.  # noqa: E501

        :return: The status of this Error.
        :rtype: float
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this Error.

        The HTTP status code generated by the API server for this occurrence of the problem.  # noqa: E501

        :param status: The status of this Error.
        :type status: float
        """
        if status is None:
            raise ValueError("Invalid value for `status`, must not be `None`")  # noqa: E501

        self._status = status

    @property
    def details(self):
        """Gets the details of this Error.

        A human-readable explanation specific to this occurrence of the problem.  # noqa: E501

        :return: The details of this Error.
        :rtype: str
        """
        return self._details

    @details.setter
    def details(self, details):
        """Sets the details of this Error.

        A human-readable explanation specific to this occurrence of the problem.  # noqa: E501

        :param details: The details of this Error.
        :type details: str
        """

        self._details = details

    @property
    def instance(self):
        """Gets the instance of this Error.

        A URI reference that identifies the specific occurrence of the problem. It may or may not yield further information if dereferenced.   # noqa: E501

        :return: The instance of this Error.
        :rtype: str
        """
        return self._instance

    @instance.setter
    def instance(self, instance):
        """Sets the instance of this Error.

        A URI reference that identifies the specific occurrence of the problem. It may or may not yield further information if dereferenced.   # noqa: E501

        :param instance: The instance of this Error.
        :type instance: str
        """

        self._instance = instance
