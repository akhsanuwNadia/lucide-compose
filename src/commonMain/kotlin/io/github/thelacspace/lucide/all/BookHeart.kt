package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookHeart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,19.5f)
                lineTo(4.0f,4.5f)
                curveTo(4.0f,3.1192882f,5.119288f,2.0f,6.5f,2.0f)
                lineTo(19.0f,2.0f)
                curveTo(19.552284f,2.0f,20.0f,2.4477153f,20.0f,3.0f)
                lineTo(20.0f,21.0f)
                curveTo(20.0f,21.552284f,19.552284f,22.0f,19.0f,22.0f)
                lineTo(6.5f,22.0f)
                curveTo(5.1236525f,21.993845f,4.0111556f,20.876362f,4.0111556f,19.5f)
                curveTo(4.0111556f,18.123638f,5.1236525f,17.006155f,6.5f,17.0f)
                lineTo(20.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.62f,9.8f)
                curveTo(8.046982f,9.202571f,7.8482995f,8.338743f,8.102725f,7.551f)
                curveTo(8.35715f,6.763257f,9.023585f,6.178845f,9.837807f,6.0294666f)
                curveTo(10.652029f,5.880088f,11.482514f,6.1898727f,12.0f,6.836f)
                curveTo(12.519877f,6.1967387f,13.347599f,5.8927794f,14.157637f,6.043664f)
                curveTo(14.967674f,6.1945486f,15.6304455f,6.77614f,15.885294f,7.5597086f)
                curveTo(16.140142f,8.343277f,15.9463f,9.203475f,15.38f,9.802f)
                lineTo(12.754f,12.658f)
                curveTo(12.564449f,12.876255f,12.289576f,13.001598f,12.0005f,13.001598f)
                curveTo(11.711424f,13.001598f,11.43655f,12.876255f,11.247f,12.658f)
                close()
            }
}

public val LucideIcons.All.BookHeartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookHeart: ImageVector
    @Composable get() = BookHeartDefinition.asImageVector()
