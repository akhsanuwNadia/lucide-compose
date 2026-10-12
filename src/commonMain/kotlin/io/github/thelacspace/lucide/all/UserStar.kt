package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserStar") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.051f,12.616f)
                curveTo(16.186604f,12.200042f,16.576857f,11.920525f,17.014326f,11.926024f)
                curveTo(17.451796f,11.931524f,17.8349f,12.220764f,17.960001f,12.64f)
                lineTo(18.697f,14.092f)
                curveTo(18.842495f,14.378342f,19.116673f,14.577372f,19.434f,14.627f)
                lineTo(21.068f,14.882999f)
                curveTo(21.499565f,14.8846855f,21.88136f,15.163041f,22.014967f,15.573406f)
                curveTo(22.148573f,15.98377f,22.003847f,16.433552f,21.656f,16.689f)
                lineTo(20.484f,17.856998f)
                curveTo(20.256372f,18.083622f,20.151463f,18.405794f,20.202f,18.722998f)
                lineTo(20.461f,20.335999f)
                curveTo(20.607288f,20.751066f,20.465023f,21.212982f,20.110563f,21.473824f)
                curveTo(19.756102f,21.734667f,19.272778f,21.733114f,18.92f,21.47f)
                lineTo(17.455f,20.72f)
                curveTo(17.168695f,20.573305f,16.829304f,20.573305f,16.543f,20.72f)
                lineTo(15.077999f,21.47f)
                curveTo(14.725301f,21.730888f,14.243745f,21.731434f,13.890456f,21.471346f)
                curveTo(13.537167f,21.211256f,13.3946495f,20.751272f,13.539f,20.337f)
                lineTo(13.797f,18.723999f)
                curveTo(13.847536f,18.406796f,13.742626f,18.084623f,13.515f,17.858f)
                lineTo(12.359f,16.705f)
                curveTo(11.999103f,16.455664f,11.843252f,16.001198f,11.974395f,15.583469f)
                curveTo(12.105536f,15.165741f,12.493171f,14.881897f,12.931f,14.882999f)
                lineTo(14.564f,14.627f)
                curveTo(14.881329f,14.577372f,15.155506f,14.378342f,15.301001f,14.092f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,15.0f)
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
}

public val LucideIcons.All.UserStarDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserStar: ImageVector
    @Composable get() = UserStarDefinition.asImageVector()
