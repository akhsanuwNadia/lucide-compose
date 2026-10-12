package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HardDriveUpload") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,6.0f)
                lineTo(12.0f,2.0f)
                lineTo(8.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,14.0f)
                lineTo(20.0f,14.0f)
                lineTo(22.0f,14.0f)
                lineTo(22.0f,22.0f)
                lineTo(20.0f,22.0f)
                lineTo(4.0f,22.0f)
                lineTo(2.0f,22.0f)
                lineTo(2.0f,14.0f)
                lineTo(4.0f,14.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,18.0f)
                lineTo(6.01f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,18.0f)
                lineTo(10.01f,18.0f)
            }
}

public val LucideIcons.All.HardDriveUploadDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HardDriveUpload: ImageVector
    @Composable get() = HardDriveUploadDefinition.asImageVector()
