package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserRoundStar") { strokeWidth ->
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
                curveTo(13.847874f,18.406467f,13.742938f,18.083845f,13.515f,17.856998f)
                lineTo(12.359f,16.704998f)
                curveTo(11.999103f,16.455662f,11.843252f,16.001196f,11.974395f,15.5834675f)
                curveTo(12.105536f,15.165739f,12.493171f,14.881895f,12.931f,14.8829975f)
                lineTo(14.564f,14.626998f)
                curveTo(14.881329f,14.57737f,15.155506f,14.37834f,15.301001f,14.091998f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,21.0f)
                curveTo(2.0005515f,17.05398f,4.8782873f,13.697754f,8.778f,13.094999f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.927f,12.885f)
                curveTo(6.3226376f,12.312684f,4.6256523f,9.797336f,5.0701017f,7.1681314f)
                curveTo(5.5145516f,4.538927f,7.944027f,2.7211297f,10.591799f,3.036652f)
                curveTo(13.239571f,3.3521745f,15.173842f,5.689979f,14.988f,8.35f)
            }
}

public val LucideIcons.All.UserRoundStarDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserRoundStar: ImageVector
    @Composable get() = UserRoundStarDefinition.asImageVector()
