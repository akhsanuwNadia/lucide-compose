package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MailOpen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.2f,8.4f)
                curveTo(21.7f,8.78f,22.0f,9.37f,22.0f,10.0f)
                lineTo(22.0f,20.0f)
                curveTo(22.0f,21.10457f,21.10457f,22.0f,20.0f,22.0f)
                lineTo(4.0f,22.0f)
                curveTo(2.8954306f,22.0f,2.0f,21.10457f,2.0f,20.0f)
                lineTo(2.0f,10.0f)
                curveTo(1.9999999f,9.370485f,2.2963881f,8.777708f,2.8f,8.4f)
                lineTo(10.8f,2.3999996f)
                curveTo(11.511111f,1.866666f,12.48889f,1.866666f,13.200001f,2.3999996f)
                lineTo(21.2f,8.4f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,10.0f)
                lineTo(13.03f,15.7f)
                curveTo(12.400046f,16.09468f,11.599953f,16.09468f,10.969999f,15.7f)
                lineTo(2.0f,10.0f)
            }
}

public val LucideIcons.All.MailOpenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MailOpen: ImageVector
    @Composable get() = MailOpenDefinition.asImageVector()
