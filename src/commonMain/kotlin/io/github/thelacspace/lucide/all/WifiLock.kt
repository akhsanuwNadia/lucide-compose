package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WifiLock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,8.819999694824219)
                curveTo(7.6940131187438965,3.7271194458007812,16.305986404418945,3.7271194458007812,22.0,8.819999694824219)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,16.0)
                lineTo(20.0,14.0)
                curveTo(19.995075225830078,12.898921966552734,19.101089477539062,12.00892448425293,18.0,12.00892448425293)
                curveTo(16.898910522460938,12.00892448425293,16.004924774169922,12.898921966552734,16.0,14.0)
                lineTo(16.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,12.859000205993652)
                curveTo(7.228026866912842,10.674515724182129,10.348027229309082,9.655226707458496,13.435999870300293,10.10300064086914)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5,16.429000854492188)
                curveTo(9.010343551635742,15.928418159484863,9.622096061706543,15.543089866638184,10.293999671936035,15.29900074005127)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,16.0)
                lineTo(21.0,16.0)
                lineTo(22.0,16.0)
                lineTo(22.0,21.0)
                lineTo(21.0,21.0)
                lineTo(15.0,21.0)
                lineTo(14.0,21.0)
                lineTo(14.0,16.0)
                lineTo(15.0,16.0)
                close()
            }
}

public val LucideIcons.All.WifiLockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WifiLock: ImageVector
    @Composable get() = WifiLockDefinition.asImageVector()
