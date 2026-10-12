package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("User") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0f,21.0f)
                lineTo(19.0f,19.0f)
                curveTo(19.0f,16.790861f,17.209139f,15.0f,15.0f,15.0f)
                lineTo(9.0f,15.0f)
                curveTo(6.790861f,15.0f,5.0f,16.790861f,5.0f,19.0f)
                lineTo(5.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,7.0f)
                curveTo(7.99359f,8.433324f,8.7545805f,9.760521f,9.994819f,10.479039f)
                curveTo(11.235056f,11.197558f,12.764944f,11.197558f,14.005181f,10.479039f)
                curveTo(15.2454195f,9.760521f,16.00641f,8.433324f,16.0f,7.0f)
                curveTo(16.00641f,5.566676f,15.2454195f,4.239479f,14.005181f,3.5209603f)
                curveTo(12.764944f,2.8024418f,11.235056f,2.8024418f,9.994819f,3.5209603f)
                curveTo(8.7545805f,4.239479f,7.99359f,5.566676f,8.0f,7.0f)
            }
}

public val LucideIcons.All.UserDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.User: ImageVector
    @Composable get() = UserDefinition.asImageVector()
