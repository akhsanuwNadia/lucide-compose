package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserKey") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0f,11.0f)
                lineTo(20.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,13.0f)
                lineTo(22.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,21.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,16.790861f,4.790861f,15.0f,7.0f,15.0f)
                lineTo(13.0f,15.0f)
                curveTo(13.730488f,14.999856f,14.447068f,15.199752f,15.0720005f,15.578f)
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
                moveTo(18.0f,19.0f)
                curveTo(17.996796f,19.716661f,18.37729f,20.38026f,18.99741f,20.73952f)
                curveTo(19.617527f,21.09878f,20.382473f,21.09878f,21.00259f,20.73952f)
                curveTo(21.62271f,20.38026f,22.003204f,19.716661f,22.0f,19.0f)
                curveTo(22.003204f,18.283339f,21.62271f,17.61974f,21.00259f,17.26048f)
                curveTo(20.382473f,16.90122f,19.617527f,16.90122f,18.99741f,17.26048f)
                curveTo(18.37729f,17.61974f,17.996796f,18.283339f,18.0f,19.0f)
            }
}

public val LucideIcons.All.UserKeyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserKey: ImageVector
    @Composable get() = UserKeyDefinition.asImageVector()
