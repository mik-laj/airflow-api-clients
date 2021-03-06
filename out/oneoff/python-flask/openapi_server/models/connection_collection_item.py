# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server import util


class ConnectionCollectionItem(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, connection_id=None, conn_type=None, host=None, login=None, schema=None, port=None):  # noqa: E501
        """ConnectionCollectionItem - a model defined in OpenAPI

        :param connection_id: The connection_id of this ConnectionCollectionItem.  # noqa: E501
        :type connection_id: str
        :param conn_type: The conn_type of this ConnectionCollectionItem.  # noqa: E501
        :type conn_type: str
        :param host: The host of this ConnectionCollectionItem.  # noqa: E501
        :type host: str
        :param login: The login of this ConnectionCollectionItem.  # noqa: E501
        :type login: str
        :param schema: The schema of this ConnectionCollectionItem.  # noqa: E501
        :type schema: str
        :param port: The port of this ConnectionCollectionItem.  # noqa: E501
        :type port: int
        """
        self.openapi_types = {
            'connection_id': str,
            'conn_type': str,
            'host': str,
            'login': str,
            'schema': str,
            'port': int
        }

        self.attribute_map = {
            'connection_id': 'connection_id',
            'conn_type': 'conn_type',
            'host': 'host',
            'login': 'login',
            'schema': 'schema',
            'port': 'port'
        }

        self._connection_id = connection_id
        self._conn_type = conn_type
        self._host = host
        self._login = login
        self._schema = schema
        self._port = port

    @classmethod
    def from_dict(cls, dikt) -> 'ConnectionCollectionItem':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ConnectionCollectionItem of this ConnectionCollectionItem.  # noqa: E501
        :rtype: ConnectionCollectionItem
        """
        return util.deserialize_model(dikt, cls)

    @property
    def connection_id(self):
        """Gets the connection_id of this ConnectionCollectionItem.


        :return: The connection_id of this ConnectionCollectionItem.
        :rtype: str
        """
        return self._connection_id

    @connection_id.setter
    def connection_id(self, connection_id):
        """Sets the connection_id of this ConnectionCollectionItem.


        :param connection_id: The connection_id of this ConnectionCollectionItem.
        :type connection_id: str
        """

        self._connection_id = connection_id

    @property
    def conn_type(self):
        """Gets the conn_type of this ConnectionCollectionItem.


        :return: The conn_type of this ConnectionCollectionItem.
        :rtype: str
        """
        return self._conn_type

    @conn_type.setter
    def conn_type(self, conn_type):
        """Sets the conn_type of this ConnectionCollectionItem.


        :param conn_type: The conn_type of this ConnectionCollectionItem.
        :type conn_type: str
        """

        self._conn_type = conn_type

    @property
    def host(self):
        """Gets the host of this ConnectionCollectionItem.


        :return: The host of this ConnectionCollectionItem.
        :rtype: str
        """
        return self._host

    @host.setter
    def host(self, host):
        """Sets the host of this ConnectionCollectionItem.


        :param host: The host of this ConnectionCollectionItem.
        :type host: str
        """

        self._host = host

    @property
    def login(self):
        """Gets the login of this ConnectionCollectionItem.


        :return: The login of this ConnectionCollectionItem.
        :rtype: str
        """
        return self._login

    @login.setter
    def login(self, login):
        """Sets the login of this ConnectionCollectionItem.


        :param login: The login of this ConnectionCollectionItem.
        :type login: str
        """

        self._login = login

    @property
    def schema(self):
        """Gets the schema of this ConnectionCollectionItem.


        :return: The schema of this ConnectionCollectionItem.
        :rtype: str
        """
        return self._schema

    @schema.setter
    def schema(self, schema):
        """Sets the schema of this ConnectionCollectionItem.


        :param schema: The schema of this ConnectionCollectionItem.
        :type schema: str
        """

        self._schema = schema

    @property
    def port(self):
        """Gets the port of this ConnectionCollectionItem.


        :return: The port of this ConnectionCollectionItem.
        :rtype: int
        """
        return self._port

    @port.setter
    def port(self, port):
        """Sets the port of this ConnectionCollectionItem.


        :param port: The port of this ConnectionCollectionItem.
        :type port: int
        """

        self._port = port
