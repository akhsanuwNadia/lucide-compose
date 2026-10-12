package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserLock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0f,16.0f)
                lineTo(19.0f,14.0f)
                curveTo(18.995075f,12.898922f,18.10109f,12.0089245f,17.0f,12.0089245f)
                curveTo(15.8989105f,12.0089245f,15.004924f,12.898922f,15.0f,14.0f)
                lineTo(15.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5f,15.0f)
                lineTo(7.0f,15.0f)
                curveTo(4.790861f,15.0f,3.0f,16.790861f,3.0f,19.0f)
                lineTo(3.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,7.0f)
                curveTo(5.99359f,8.433324f,6.7545805f,9.760521f,7.994818f,10.479039f)
                curveTo(9.235056f,11.197558f,10.764944f,11.197558f,12.005181f,10.479039f)
                curveTo(13.2454195f,9.760521f,14.00641f,8.433324f,14.0f,7.0f)
                curveTo(14.00641f,5.566676f,13.2454195f,4.239479f,12.005181f,3.5209603f)
                curveTo(10.764944f,2.8024418f,9.235056f,2.8024418f,7.994818f,3.5209603f)
                curveTo(6.7545805f,4.239479f,5.99359f,5.566676f,6.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.899f,16.0f)
                lineTo(20.101f,16.0f)
                lineTo(21.0f,16.0f)
                lineTo(21.0f,21.0f)
                lineTo(20.101f,21.0f)
                lineTo(13.899f,21.0f)
                lineTo(13.0f,21.0f)
                lineTo(13.0f,16.0f)
                lineTo(13.899f,16.0f)
                close()
            }
}

public val LucideIcons.All.UserLockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserLock: ImageVector
    @Composable get() = UserLockDefinition.asImageVector()
