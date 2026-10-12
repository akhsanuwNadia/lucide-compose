package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudDownload") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,13.0f)
                lineTo(12.0f,21.0f)
                lineTo(8.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,21.0f)
                lineTo(16.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.393f,15.269f)
                curveTo(2.1531913f,13.309624f,1.3970555f,10.14829f,2.5078824f,7.3875f)
                curveTo(3.6187096f,4.6267095f,6.353646f,2.8700378f,9.326335f,3.007953f)
                curveTo(12.299024f,3.145868f,14.859563f,5.1482186f,15.71f,8.0f)
                lineTo(17.5f,8.0f)
                curveTo(19.496534f,7.9997487f,21.254522f,9.315041f,21.817778f,11.230477f)
                curveTo(22.381033f,13.145913f,21.614864f,15.203461f,19.936f,16.284f)
            }
}

public val LucideIcons.All.CloudDownloadDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudDownload: ImageVector
    @Composable get() = CloudDownloadDefinition.asImageVector()
