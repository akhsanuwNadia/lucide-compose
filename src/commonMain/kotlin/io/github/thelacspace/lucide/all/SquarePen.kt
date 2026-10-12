package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquarePen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,3.0f)
                lineTo(5.0f,3.0f)
                curveTo(3.8954306f,3.0f,3.0f,3.8954306f,3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(19.0f,21.0f)
                curveTo(20.10457f,21.0f,21.0f,20.10457f,21.0f,19.0f)
                lineTo(21.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.375f,2.625f)
                curveTo(19.204502f,1.8028845f,20.54249f,1.8058764f,21.368307f,2.6316931f)
                curveTo(22.194124f,3.45751f,22.197115f,4.7954984f,21.375f,5.625f)
                lineTo(12.362f,14.639f)
                curveTo(12.12455f,14.876246f,11.831206f,15.049913f,11.509001f,15.144f)
                lineTo(8.636001f,15.984f)
                curveTo(8.460735f,16.03512f,8.271543f,15.986649f,8.142447f,15.8575535f)
                curveTo(8.013352f,15.728458f,7.964882f,15.539266f,8.016001f,15.364f)
                lineTo(8.856001f,12.491f)
                curveTo(8.950527f,12.169051f,9.124535f,11.876058f,9.362f,11.639f)
                close()
            }
}

public val LucideIcons.All.SquarePenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquarePen: ImageVector
    @Composable get() = SquarePenDefinition.asImageVector()
