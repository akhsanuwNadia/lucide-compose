package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Shirt") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.38f,3.46f)
                lineTo(16.0f,2.0f)
                curveTo(15.990151f,4.2021565f,14.202178f,5.9821515f,12.0f,5.9821515f)
                curveTo(9.797822f,5.9821515f,8.009849f,4.2021565f,8.0f,2.0f)
                lineTo(3.62f,3.46f)
                curveTo(2.6848342f,3.7715607f,2.1161096f,4.71802f,2.2799997f,5.69f)
                lineTo(2.8599997f,9.16f)
                curveTo(2.9386566f,9.645285f,3.3583834f,10.001417f,3.8499997f,10.0f)
                lineTo(6.0f,10.0f)
                lineTo(6.0f,20.0f)
                curveTo(6.0f,21.1f,6.9f,22.0f,8.0f,22.0f)
                lineTo(16.0f,22.0f)
                curveTo(17.10457f,22.0f,18.0f,21.10457f,18.0f,20.0f)
                lineTo(18.0f,10.0f)
                lineTo(20.15f,10.0f)
                curveTo(20.641615f,10.001417f,21.061342f,9.645285f,21.14f,9.16f)
                lineTo(21.72f,5.6899996f)
                curveTo(21.88389f,4.7180195f,21.315165f,3.7715602f,20.38f,3.4599996f)
                close()
            }
}

public val LucideIcons.All.ShirtDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Shirt: ImageVector
    @Composable get() = ShirtDefinition.asImageVector()
