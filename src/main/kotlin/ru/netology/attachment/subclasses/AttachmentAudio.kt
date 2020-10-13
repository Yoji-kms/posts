package ru.netology.attachment.subclasses

import ru.netology.attachment.Attachment
import ru.netology.attachment.AttachmentType
import ru.netology.attachment.types.Audio

data class AttachmentAudio(val audio: Audio) : Attachment {
    override val type: AttachmentType
        get() = AttachmentType.AUDIO
}