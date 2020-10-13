package ru.netology.attachment.subclasses

import ru.netology.attachment.Attachment
import ru.netology.attachment.AttachmentType
import ru.netology.attachment.types.Doc

data class AttachmentDoc(val doc: Doc) : Attachment {
    override val type: AttachmentType
        get() = AttachmentType.DOC
}