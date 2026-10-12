package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Send") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.536f,21.686f)
                curveTo(14.613805f,21.879908f,14.803976f,22.004992f,15.012841f,21.999641f)
                curveTo(15.221707f,21.994293f,15.405225f,21.859636f,15.473001f,21.662f)
                lineTo(21.973f,2.6620007f)
                curveTo(22.038334f,2.4811172f,21.993214f,2.2787695f,21.857222f,2.1427782f)
                curveTo(21.721231f,2.0067866f,21.518883f,1.9616667f,21.338f,2.0270007f)
                lineTo(2.3379993f,8.527f)
                curveTo(2.1403637f,8.594776f,2.0057075f,8.778295f,2.0003579f,8.98716f)
                curveTo(1.995008f,9.196025f,2.1200926f,9.386196f,2.3139994f,9.464001f)
                lineTo(10.2439995f,12.644001f)
                curveTo(10.7505665f,12.846816f,11.152273f,13.2478f,11.355999f,13.754001f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.854f,2.147f)
                lineTo(10.9140005f,13.086f)
            }
}

public val LucideIcons.All.SendDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Send: ImageVector
    @Composable get() = SendDefinition.asImageVector()
