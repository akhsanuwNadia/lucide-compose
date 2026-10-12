package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Letters") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,8.0f)
                lineTo(9.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,15.354f)
                curveTo(19.899582f,14.106453f,18.141905f,13.670195f,16.58585f,14.258401f)
                curveTo(15.029797f,14.846608f,14.000219f,16.336481f,14.000219f,18.0f)
                curveTo(14.000219f,19.663519f,15.029797f,21.153393f,16.58585f,21.741598f)
                curveTo(18.141905f,22.329805f,19.899582f,21.893547f,21.0f,20.646f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,18.0f)
                lineTo(7.0f,18.0f)
                curveTo(8.101078f,18.004925f,8.9910755f,18.89891f,8.9910755f,20.0f)
                curveTo(8.9910755f,21.10109f,8.101078f,21.995075f,7.0f,22.0f)
                lineTo(3.5f,22.0f)
                curveTo(3.2238576f,22.0f,3.0f,21.776142f,3.0f,21.5f)
                lineTo(3.0f,14.5f)
                curveTo(3.0f,14.223858f,3.2238576f,14.0f,3.5f,14.0f)
                lineTo(6.0f,14.0f)
                curveTo(7.101078f,14.004924f,7.9910755f,14.8989105f,7.9910755f,16.0f)
                curveTo(7.9910755f,17.10109f,7.101078f,17.995075f,6.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,10.0f)
                lineTo(11.453f,2.3520002f)
                curveTo(11.549968f,2.136873f,11.764029f,1.9985588f,12.0f,1.9985588f)
                curveTo(12.235971f,1.9985588f,12.450032f,2.136873f,12.547f,2.3520002f)
                lineTo(16.0f,10.0f)
            }
}

public val LucideIcons.All.LettersDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Letters: ImageVector
    @Composable get() = LettersDefinition.asImageVector()
