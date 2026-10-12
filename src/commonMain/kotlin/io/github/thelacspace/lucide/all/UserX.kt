package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,21.0f)
                lineTo(16.0f,19.0f)
                curveTo(16.0f,16.790861f,14.209139f,15.0f,12.0f,15.0f)
                lineTo(6.0f,15.0f)
                curveTo(3.790861f,15.0f,2.0f,16.790861f,2.0f,19.0f)
                lineTo(2.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,7.0f)
                curveTo(4.99359f,8.433324f,5.7545805f,9.760521f,6.994818f,10.479039f)
                curveTo(8.235056f,11.197558f,9.764944f,11.197558f,11.005181f,10.479039f)
                curveTo(12.2454195f,9.760521f,13.00641f,8.433324f,13.0f,7.0f)
                curveTo(13.00641f,5.566676f,12.2454195f,4.239479f,11.005181f,3.5209603f)
                curveTo(9.764944f,2.8024418f,8.235056f,2.8024418f,6.994818f,3.5209603f)
                curveTo(5.7545805f,4.239479f,4.99359f,5.566676f,5.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,8.0f)
                lineTo(22.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,8.0f)
                lineTo(17.0f,13.0f)
            }
}

public val LucideIcons.All.UserXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserX: ImageVector
    @Composable get() = UserXDefinition.asImageVector()
