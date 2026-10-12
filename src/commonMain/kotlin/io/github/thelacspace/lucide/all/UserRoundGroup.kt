package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserRoundGroup") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,21.0f)
                curveTo(16.98769f,18.247305f,14.752723f,16.02231f,12.0f,16.02231f)
                curveTo(9.247277f,16.02231f,7.0123105f,18.247305f,7.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,10.5f)
                curveTo(22.000225f,9.194853f,21.274242f,7.997997f,20.116669f,7.395142f)
                curveTo(18.959095f,6.792288f,17.562248f,6.883591f,16.493f,7.632f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.507f,7.632f)
                curveTo(6.437751f,6.883591f,5.0409045f,6.792288f,3.883331f,7.395142f)
                curveTo(2.7257578f,7.997997f,1.9997742f,9.194853f,2.0f,10.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,13.0f)
                curveTo(8.995193f,14.074993f,9.565935f,15.070391f,10.496114f,15.60928f)
                curveTo(11.426291f,16.148169f,12.573709f,16.148169f,13.503886f,15.60928f)
                curveTo(14.434065f,15.070391f,15.004807f,14.074993f,15.0f,13.0f)
                curveTo(15.004807f,11.925007f,14.434065f,10.929609f,13.503886f,10.39072f)
                curveTo(12.573709f,9.851831f,11.426291f,9.851831f,10.496114f,10.39072f)
                curveTo(9.565935f,10.929609f,8.995193f,11.925007f,9.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,4.5f)
                curveTo(15.995994f,5.3958273f,16.471613f,6.2253256f,17.246761f,6.6744f)
                curveTo(18.02191f,7.123474f,18.97809f,7.123474f,19.753239f,6.6744f)
                curveTo(20.528387f,6.2253256f,21.004005f,5.3958273f,21.0f,4.5f)
                curveTo(21.004005f,3.6041727f,20.528387f,2.7746744f,19.753239f,2.3256004f)
                curveTo(18.97809f,1.8765261f,18.02191f,1.8765261f,17.246761f,2.3256004f)
                curveTo(16.471613f,2.7746744f,15.995994f,3.6041727f,16.0f,4.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,4.5f)
                curveTo(2.9959936f,5.3958273f,3.471613f,6.2253256f,4.2467613f,6.6744f)
                curveTo(5.0219097f,7.123474f,5.9780903f,7.123474f,6.7532387f,6.6744f)
                curveTo(7.528387f,6.2253256f,8.004006f,5.3958273f,8.0f,4.5f)
                curveTo(8.004006f,3.6041727f,7.528387f,2.7746744f,6.7532387f,2.3256004f)
                curveTo(5.9780903f,1.8765261f,5.0219097f,1.8765261f,4.2467613f,2.3256004f)
                curveTo(3.471613f,2.7746744f,2.9959936f,3.6041727f,3.0f,4.5f)
            }
}

public val LucideIcons.All.UserRoundGroupDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserRoundGroup: ImageVector
    @Composable get() = UserRoundGroupDefinition.asImageVector()
